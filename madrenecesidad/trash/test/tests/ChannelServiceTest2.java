package org.sgx.madrenecesidad.client.trash.test.tests;

import org.sgx.madrenecesidad.client.model.Channel;
import org.sgx.madrenecesidad.client.service.ChannelService;
import org.sgx.madrenecesidad.client.service.ChannelServiceAsync;
import org.sgx.madrenecesidad.client.service.TagService;
import org.sgx.madrenecesidad.client.service.TagServiceAsync;
import org.sgx.madrenecesidad.client.trash.test.AbstractTest;
import org.sgx.madrenecesidad.client.util.syncqueue.SyncQueue;
import org.sgx.madrenecesidad.client.util.syncqueue.Task;
import org.sgx.yuigwt.yui.YuiContext;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * tests ChannelService implementation. It uses yui asyncqueue for doing GWT RPC
 * calls syncronically.
 * 
 * @author sg
 * 
 */
public class ChannelServiceTest2 extends AbstractTest {

	private final TagServiceAsync tagService = GWT.create(TagService.class);
	private final ChannelServiceAsync channelService = GWT.create(ChannelService.class);

	protected Channel c1;

	public ChannelServiceTest2(YuiContext y) {
		super(y);
	}

	@Override
	public void test() {
		SyncQueue queue = new SyncQueue();
		queue.setDelayBetweenTask(1000); 
		
		// delete all channels

		queue.append(new Task() {
			@Override
			public void run() {
				channelService.cleanAll(new AsyncCallback<Void>() {
					@Override
					public void onSuccess(Void result) {
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("test1 channelService.cleanAll onFailure: " + caught);
						endTask();
					}
				});
			}
		});
		
//		call it again -for some reasons sometime it do not do the work... TODO
		queue.append(new Task() {
			@Override
			public void run() {
				channelService.cleanAll(new AsyncCallback<Void>() {
					@Override
					public void onSuccess(Void result) {
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("test1 channelService.cleanAll onFailure: " + caught);
						endTask();
					}
				});
			}
		});
		
		//call it again -for some reasons sometime it do not do the work... TODO
		queue.append(new Task() {
			@Override
			public void run() {
				channelService.cleanAll(new AsyncCallback<Void>() {
					@Override
					public void onSuccess(Void result) {
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("test1 channelService.getChanels onFailure: " + caught);
						endTask();
					}
					// endTask();
				});
			}
		});
		
		
		//addTest1
		queue.append(new Task() {
			@Override
			public void run() {
				Channel c = new Channel(); 
//				c.set
			}
		});
		
				
		queue.append(new Task() {
			@Override
			public void run() {
				getConsole().log(printTestResults());
				endTask();
			}
		});

		queue.run();

	}
}
