package org.sgx.madrenecesidad.client.trash.test.tests;

import java.util.List;

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
public class ChannelServiceTest1 extends AbstractTest {

	private final TagServiceAsync tagService = GWT.create(TagService.class);
	private final ChannelServiceAsync channelService = GWT.create(ChannelService.class);

	protected Channel c1;

	public ChannelServiceTest1(YuiContext y) {
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
						fail("test1 channelService.cleanAll onFailure: " + caught);
						endTask();
					}
				});
			}
		});
		

		// check if they were deleted using getChannels

		queue.append(new Task() {
			@Override
			public void run() {
				channelService.getChannels(new AsyncCallback<List<Channel>>() {
					@Override
					public void onSuccess(List<Channel> result) {
						if(!assertTrue(result != null, "delteAllChannelsTesting1")) {
							return; 
						}
						assertTrue(result.size() == 0, "delteAllChannelsTesting2 - results: "+result.size());
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("getChannels onFailure: " + caught);
						endTask();
					}
				});

			}
		});

		// add a channel

		queue.append(new Task() {
			@Override
			public void run() {
				c1 = new Channel();
				c1.setName("Channel1");
				c1.setDescription("channel1 descr");
				channelService.addChannel(c1, new AsyncCallback<Void>() {
					@Override
					public void onSuccess(Void result) {
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("test1 channelService.addChannel onFailure: " + caught);
						endTask();
					}
				});
			}
		});

		// getChannelByName test

		queue.append(new Task() {
			@Override
			public void run() {
				channelService.getChannelByName("Channel1", new AsyncCallback<Channel>() {
					@Override
					public void onSuccess(Channel result) {
						ChannelServiceTest1.this.c1 = result; 
//						getConsole().log("SSSSSEEEE: "+c1.getIndexId()); 
						assertTrue(result != null, "getChannelByName 1");
						if (result == null) {
							fail("getChannelByName 1");
							endTask();
							return;
						}
						// getConsole().log("SSSSSEEEEEBBBA: "+result);
						assertTrue(result.getName().equals("Channel1"), "getChannelByName 2");
						assertTrue(result.getDescription().equals("channel1 descr"), "getChannelByName 3");
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("getChannelByName onFailure: " + caught);
						endTask();
					}
				});
				// endTask();
			}
		});

		// getChannels test

		queue.append(new Task() {
			@Override
			public void run() {
				channelService.getChannels(new AsyncCallback<List<Channel>>() {

					@Override
					public void onSuccess(List<Channel> result) {
						assertTrue(result != null, "getChannels 1");
						assertTrue(result.size() == 1, "getChannels 2");

						Channel cc = result.get(0);
						assertTrue(cc.getName().equals("Channel1"), "getChannels 3");
						assertTrue(cc.getDescription().equals("channel1 descr"), "getChannels 4");
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("getChannels onFailure: " + caught);
						endTask();
					}
				});

			}
		});

		// searchChannel1

		queue.append(new Task() {
			@Override
			public void run() {
				channelService.searchChannel("Channel1", new AsyncCallback<List<Channel>>() {
					@Override
					public void onSuccess(List<Channel> result) {
						assertTrue(result != null && result.size() == 1, "searchChannel1");
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("searchChannel1 onFailure: " + caught);
						endTask();
					}
				});
			}
		});

		// searchChannel2

		queue.append(new Task() {
			@Override
			public void run() {			
				channelService.searchChannel("ChannelNonExistent", new AsyncCallback<List<Channel>>() {
					@Override
					public void onSuccess(List<Channel> result) {
						assertTrue(result!=null && result.size()==0, "searchChannel2 results not empty: "+result.size()); 
//						fail("searchChannel2: should fail");
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("searchChannel2 onFailure: " + caught);
						endTask();
					}
				});
			}
		});
		
		// update1

		queue.append(new Task() {
			@Override
			public void run() {	
				c1.setDescription("newdescr99"); 
				channelService.addChannel(c1, new AsyncCallback<Void>() {					
					@Override
					public void onSuccess(Void result) {
						endTask(); 
					}					
					@Override
					public void onFailure(Throwable caught) {
						fail("update1 onFailure1: " + caught);
						endTask(); 
					}
				}); 				
			}
		});
				
		// testUpdate1 - 

		queue.append(new Task() {
			@Override
			public void run() {	
				channelService.getChannelByName(c1.getName(), new AsyncCallback<Channel>() {					
					@Override
					public void onSuccess(Channel result) {		
						// reasign variable c1 because it was changed on update - it will be used again for deleting. 
						ChannelServiceTest1.this.c1 = result; 
						assertTrue(result.getDescription().equals("newdescr99"), "testUpdate11");
						assertTrue(true, "testUpdate12"); 
						endTask();
					}					
					@Override
					public void onFailure(Throwable caught) {	
						fail("testUpdate1 onFailure1: " + caught);
						endTask();
					}
				}); 							
			}
		});
						
		// searchChannel2

		queue.append(new Task() {
			@Override
			public void run() {
				channelService.searchChannel("newdescr99", new AsyncCallback<List<Channel>>() {
					@Override
					public void onSuccess(List<Channel> result) {
						assertTrue(result != null && result.size() == 1, "searchChannel2");
						endTask();
					}
					@Override
					public void onFailure(Throwable caught) {
						fail("searchChannel2 onFailure: " + caught);
						endTask();
					}
				});
			}
		});		
		
		// deleteChannel1

		queue.append(new Task() {
			@Override
			public void run() {
				channelService.deleteChannel(c1, new AsyncCallback<Void>() {					
					@Override
					public void onSuccess(Void result) {
						endTask();
					}					
					@Override
					public void onFailure(Throwable caught) {
						fail("deleteChannel1 onFailure: " + caught);
						endTask();
					}
				});
			}
		});				
		
		// deleteChannel1Test1

		queue.append(new Task() {
			@Override
			public void run() {
				channelService.getChannelByName(c1.getName(), new AsyncCallback<Channel>() {					
					@Override
					public void onSuccess(Channel result) {
						assertTrue(result==null, "deleteChannel1Test11"); 
						endTask();
					}					
					@Override
					public void onFailure(Throwable caught) {
						fail("deleteChannel1Test1 onFailure: " + caught);
						endTask();
					}
				}); 
			}
		});
		
		// deleteChannel1Test2
		
		queue.append(new Task() {
			@Override
			public void run() {
				channelService.getChannels(new AsyncCallback<List<Channel>>() {					
					@Override
					public void onSuccess(List<Channel> result) {
						assertTrue(result.size()==0, "deleteChannel1Test21"); 
						endTask();
					}					
					@Override
					public void onFailure(Throwable caught) {
						fail("deleteChannel1Test2 onFailure: " + caught);
						endTask();
					}
				}); 
			}
		});
		
		// deleteChannel1Test3
		
		queue.append(new Task() {
			@Override
			public void run() {
				channelService.searchChannel(c1.getName(), new AsyncCallback<List<Channel>>() {					
					@Override
					public void onSuccess(List<Channel> result) {
						assertTrue(result.size()==0, "deleteChannel1Test31");
						endTask();
					}					
					@Override
					public void onFailure(Throwable caught) {
						fail("deleteChannel1Test3 onFailure: " + caught);
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
