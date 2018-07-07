package org.sgx.yuigwt.yui.widget.slider;

import org.sgx.yuigwt.yui.dd.DDEvent;
import org.sgx.yuigwt.yui.widget.WidgetEvent;

public class SliderEvent extends WidgetEvent {
protected SliderEvent(){}
/**
 * the DD event from the thumb
 * @return
 */
public native final DDEvent originEvent() /*-{
return this.originEvent; 
}-*/;

/**
 * the DD event from the thumb
 * @param val
 * @return this - for setter chaining
 */
public native final SliderEvent originEvent(DDEvent val) /*-{
this.originEvent = val; 
return this; 
}-*/;

/**
 * For EVENT_THUMBMOVE event only. Pixel offset from top/left of the slider to the new thumb position
 * @return
 */
public native final int offset() /*-{
return this.offset; 
}-*/;

/**
 * For EVENT_THUMBMOVE event only. Pixel offset from top/left of the slider to the new thumb position
 * @param val
 * @return this - for setter chaining
 */
public native final SliderEvent offset(int val) /*-{
this.offset = val; 
return this; 
}-*/;
}
