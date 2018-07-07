package org.sgx.madrenecesidad.client.trash.test.tests;

import java.util.List;

import org.sgx.madrenecesidad.client.model.Channel;
import org.sgx.madrenecesidad.client.model.Tag;
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
public class TagServiceTest1 extends AbstractTest {

	private final TagServiceAsync tagService = GWT.create(TagService.class);
//	private final ChannelServiceAsync channelService = GWT.create(ChannelService.class);

	protected Channel c1;

	public TagServiceTest1(YuiContext y) {
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
				tagService.cleanAll(new AsyncCallback<Void>() {
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
				tagService.cleanAll(new AsyncCallback<Void>() {
					@Override
					public void onSuccess(Void result) {
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("test1 tagService.cleanAll onFailure: " + caught);
						endTask();
					}
				});
			}
		});
		
		//call it again -for some reasons sometime it do not do the work... TODO
		queue.append(new Task() {
			@Override
			public void run() {
				tagService.cleanAll(new AsyncCallback<Void>() {
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
		
		//emptyTest1
		queue.append(new Task() {
			@Override
			public void run() {
				tagService.getTags(new AsyncCallback<List<Tag>>() {					
					@Override
					public void onSuccess(List<Tag> result) {	
						assertTrue(result.size()==0, "emptyTest11"); 
						endTask();
					}					
					@Override
					public void onFailure(Throwable caught) {
						fail("emptyTest1 onFailure: " + caught);
						endTask();
					}
				}); 
			}
		});
		
		//addTest1
		queue.append(new Task() {
			@Override
			public void run() {
				Tag tag = new Tag(); 
				tag.setName("tag1"); 
				tag.setDescription("tag1 description1234"); 
				tagService.addTag(tag, new AsyncCallback<Long>() {					
					@Override
					public void onSuccess(Long result) {
						endTask();
					}					
					@Override
					public void onFailure(Throwable caught) {
						fail("addTest1 onFailure: " + caught);
						endTask();						
					}
				}); 
			}
		});
		
		//addTest2
		queue.append(new Task() {
			@Override
			public void run() {
				Tag tag = new Tag(); 
				tag.setName("tag1"); 
				tag.setDescription("tag1 description1234"); 
				tagService.addTag(tag, new AsyncCallback<Long>() {					
					@Override
					public void onSuccess(Long result) {
						endTask();
					}					
					@Override
					public void onFailure(Throwable caught) {
						fail("addTest1 onFailure: " + caught);
						endTask();						
					}
				}); 
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
