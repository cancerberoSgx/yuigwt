package org.sgx.yuigwt.yui.event;
/**
 * Usage example
<pre>

</pre>
 * @author sg
 *
 * @param <T> the concrete event type (for not to cast) 
 */
public interface EventCallback<T extends EventFacade> {
void call(T e); 
}
