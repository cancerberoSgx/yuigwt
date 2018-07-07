package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.asyncqueue.AsyncQueue;
import org.sgx.yuigwt.yui.asyncqueue.AsyncQueueEvent;
import org.sgx.yuigwt.yui.asyncqueue.AsyncQueueItem;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.SimpleCallback;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

/**
 * AyncQueueTest1
 * 
 * @author sg
 * 
 */
public class AyncQueueTest1 extends AbstractTest {

	protected Node ta;

	public AyncQueueTest1() {
		super("asyncqueue1", "asyncqueue1", new String[] { GalleryConstants.TAG_ASYNCQUEUE, GalleryConstants.TAG_UTILS }, TestResources.instance.AyncQueueTest1());
	}

	
	public void test(final Node parent) {
		YUI.Use(new String[] { "async-queue", "button", "event", "console" }, new YUICallback() {
			
			public void ready(final YuiContext Y) {
				ta = parent.appendChild("<textarea></textarea>");
				ta.setStyle("width", "100%");

				final Console console = Y.newConsole(ConsoleConfig.create());
				console.render();

				AsyncQueueItem aqItem = AsyncQueueItem.create().id("aq1").iterations(5).timeout(150).fn(new SimpleCallback() {
					
					public void call() {
						ta.set("text", ta.get("text") + " - 1");
					}
				});

				AsyncQueueItem aqItem2 = AsyncQueueItem.create().id("aq2").iterations(6).timeout(100).fn(new SimpleCallback() {
					
					public void call() {
						ta.set("text", ta.get("text") + " - 2");
					}
				});
				AsyncQueueItem aqItem3 = AsyncQueueItem.create().id("aq3").iterations(6).timeout(100).fn(new SimpleCallback() {
					
					public void call() {
						ta.set("text", ta.get("text") + " - 3");
					}
				});

				// All AsyncQueue instances will execute all callbacks
				// synchronously by default
				Y.AsyncQueue().defaults().timeout(-1);

				final AsyncQueue aq = Y.newAsyncQueue().add(aqItem).add(aqItem2).add(aqItem3);
				ta.set("text", "indexOf A = " + aq.indexOf("aq1"));

				EventCallback<AsyncQueueEvent> callback1 = new EventCallback<AsyncQueueEvent>() {
					
					public void call(AsyncQueueEvent e) {
						console.log("Event type: " + e.type(), "", "");
					}
				};

				aq.on(new String[] { AsyncQueue.EVENT_COMPLETE, AsyncQueue.EVENT_SHIFT, AsyncQueue.EVENT_PROMOTE }, callback1);

				// a button to start and later promote item 3
				Y.newButton(ButtonConfig.create().label("start").on("click", new EventCallback<EventFacade>() {
					
					public void call(EventFacade e) {
						aq.run();

						JsUtil.setTimeout(new SimpleCallback() {
							
							public void call() {
								aq.promote("aq3");
							}
						}, 200);
					}
				})).render(parent);

			}
		});
	}

}
