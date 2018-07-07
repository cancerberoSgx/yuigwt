package org.sgx.yuigwt.yui.datatype;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

/**
 * DataType.Date provides a set of utility functions to operate against Date objects.
 * @see http://yuilibrary.com/yui/docs/api/classes/DataType.Date.html
 * @author sg
 *
 */
public class DataTypeDate extends JavaScriptObject {
protected DataTypeDate(){}
/**
 * Adds a specified number of days to the given date.
 * @param d The date to add days to.
 * @param numDays The number of days to add (can be negative)
 * @return A new Date with the specified number of days added to the original date. 
 */
public native final JsDate addDays(JsDate d, int numDays)/*-{
	return this.addDays(d, numDays); 
}-*/;
/**
 * Adds a specified number of months to the given date.
 * @param d The date to add days to.
 * @param numMonths The number of months to add (can be negative)
 * @return A new Date with the specified number of months added to the original date. 
 */
public native final JsDate addMonths(JsDate d, int numMonths)/*-{
return this.addMonths(d, numMonths); 
}-*/;
/**
 * Adds a specified number of Years to the given date.
 * @param d The date to add days to.
 * @param numYears The number of Years to add (can be negative)
 * @return A new Date with the specified number of Years added to the original date. 
 */
public native final JsDate addYears(JsDate d, int numYears)/*-{
return this.addYears(d, numYears); 
}-*/;
/**
 * True if the two dates correspond to the same date and time. 
 * @param d1
 * @param d2
 * @return checks whether two dates correspond to the same date and time.
 */
public native final boolean areEqual(JsDate d1, JsDate d2)/*-{
return this.areEqual(d1, d2); 
}-*/;
/**
 * takes a native JavaScript Date and returns the number of days in the month that the given date belongs to.
 * @param d
 * @return A number (either 28, 29, 30 or 31) of days in the given month. 
 */
public native final int daysInMonth(JsDate d)/*-{
return this.daysInMonth(d); 
}-*/;
/**
 * Takes a native JavaScript Date and formats it as a string for display to user.
 * @param d
 * @param format
    Any strftime string is supported, such as "%I:%M:%S %p". strftime has several format specifiers defined by the Open group at http://www.opengroup.org/onlinepubs/007908799/xsh/strftime.html PHP added a few of its own, defined at http://www.php.net/strftime

    <br/><br/>This javascript implementation supports all the PHP specifiers and a few more. The full list is below.

    <br/><br/>If not specified, it defaults to the ISO 8601 standard date format: %Y-%m-%d. This may be overridden by the deprecated Y.config.dateFormat property.

    <br/><br/>%a
        abbreviated weekday name according to the current locale
    <br/><br/>%A
        <br/><br/>full weekday name according to the current locale
    <br/><br/>%b
        abbreviated month name according to the current locale
    <br/><br/>%B
        full month name according to the current locale
    <br/><br/>%c
        preferred date and time representation for the current locale
    <br/><br/>%C
        century number (the year divided by 100 and truncated to an integer, range 00 to 99)
<br/><br/>    %d
        day of the month as a decimal number (range 01 to 31)
    <br/><br/>%D
        same as %m/%d/%y
   <br/><br/> %e
        day of the month as a decimal number, a single digit is preceded by a space (range " 1" to "31")
   <br/><br/> %F
        same as %Y-%m-%d (ISO 8601 date format)
   <br/><br/> %g
        like %G, but without the century
   <br/><br/> %G
        The 4-digit year corresponding to the ISO week number
   <br/><br/> %h
        same as %b
   <br/><br/> %H
        hour as a decimal number using a 24-hour clock (range 00 to 23)
  <br/><br/>  %I
        hour as a decimal number using a 12-hour clock (range 01 to 12)
  <br/><br/>  %j
        day of the year as a decimal number (range 001 to 366)
   <br/><br/> %k
        hour as a decimal number using a 24-hour clock (range 0 to 23); single digits are preceded by a blank. (See also %H.)
   <br/><br/> %l
        hour as a decimal number using a 12-hour clock (range 1 to 12); single digits are preceded by a blank. (See also %I.) 
   <br/><br/> %m
        month as a decimal number (range 01 to 12)
   <br/><br/> %M
        minute as a decimal number
    <br/><br/>%n
        newline character
   <br/><br/> %p
        either "AM" or "PM" according to the given time value, or the corresponding strings for the current locale
    <br/><br/>%P
        like %p, but lower case
   <br/><br/> %r
        time in a.m. and p.m. notation equal to %I:%M:%S %p
    <br/><br/>%R
        time in 24 hour notation equal to %H:%M
   <br/><br/> %s
        number of seconds since the Epoch, ie, since 1970-01-01 00:00:00 UTC
    <br/><br/>%S
        second as a decimal number
   <br/><br/> %t
        tab character
    <br/><br/>%T
        current time, equal to %H:%M:%S
   <br/><br/> %u
        weekday as a decimal number [1,7], with 1 representing Monday
    <br/><br/>%U
        week number of the current year as a decimal number, starting with the first Sunday as the first day of the first week
    <br/><br/>%V
        The ISO 8601:1988 week number of the current year as a decimal number, range 01 to 53, where week 1 is the first week that has at least 4 days in the current year, and with Monday as the first day of the week.
    <br/><br/>%w
        day of the week as a decimal, Sunday being 0
    <br/><br/>%W
        week number of the current year as a decimal number, starting with the first Monday as the first day of the first week
    <br/><br/>%x
        preferred date representation for the current locale without the time
    <br/><br/>%X
        preferred time representation for the current locale without the date
    <br/><br/>%y
        year as a decimal number without a century (range 00 to 99)
    <br/><br/>%Y
        year as a decimal number including the century
    <br/><br/>%z
        numerical time zone representation
    <br/><br/>%Z
        time zone name or abbreviation
   <br/><br/> %%
        a literal "%" character
        
 * @return HTML: Formatted date for display. 
 */
public native final String format(JsDate d, String format)/*-{
return this.format(d, {"format": format}); 
}-*/;
/**
 * Checks whether the first date comes later than the second.
 * @param d1
 * @param d2
 * @return True if the first date is later than the second. 
 */
public native final boolean isGreater(JsDate d1, JsDate d2)/*-{
return this.isGreater(d1, d2); 
}-*/;

/**
 * Checks whether the first date is later than or the same as the second. 
 * @param d1
 * @param d2
 * @return True if the first date is later than or is the same as the second. 
 */
public native final boolean isGreaterOrEqual(JsDate d1, JsDate d2)/*-{
return this.isGreaterOrEqual(d1, d2); 
}-*/;

/**
 * Checks whether the date is between two other given dates.
 * @param d1
 * @param d2
 * @return True if the date is between the two other given dates. 
 */
public native final boolean isInRange(JsDate aDate, JsDate bDate, JsDate cDate)/*-{
return this.isInRange(aDate, bDate, cDate); 
}-*/;
/**
 * Checks whether a native JavaScript Date contains a valid value.
 * @param aDate Date in the month for which the number of days is desired.
 * @return True if the date argument contains a valid value. 
 */
public native final boolean isValidDate(JsDate aDate)/*-{
return this.isValidDate(aDate); 
}-*/;
/**
 * Lists all dates in a given month.
 * @param aDate The date corresponding to the month for which a list of dates is required.
 * @return An Array of Dates from a given month. 
 */
public native final JsArray<JsDate> listOfDatesInMonth(JsDate aDate)/*-{
return this.listOfDatesInMonth(aDate); 
}-*/;
/**Converts data to type Date.
 * @param data Data to convert. Values supported by the Date constructor are supported.
 * @return  A Date, or null. 
 */
public native final JsDate parse(String data)/*-{
return this.parse(data); 
}-*/;
/**Converts data to type Date.
 * @param data Data to convert. Values supported by the Date constructor are supported.
 * @return  A Date, or null. 
 */
public native final JsDate parse(int data)/*-{
return this.parse(data); 
}-*/;
public native final JsDate parse(int[] data)/*-{
return this.parse.apply(this, @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayInt([I)(data)); 
}-*/;
}
