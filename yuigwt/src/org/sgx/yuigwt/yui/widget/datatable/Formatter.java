package org.sgx.yuigwt.yui.widget.datatable;

/**
 * Set the cell content with column formatters by returning the desired content
 * string from the function. Alternately, just update o.value with the new value
 * in the object passed as an argument to the formatter. When updating o.value
 * do not include a return statement.
 * 
 * <p>
 * formatters are very powerful because not only do they have access to the
 * record's value for that column's field, but they also receive the rest of the
 * record's data, the record Model instance itself, and the column configuration
 * object. This allows you to include any extra configurations in your column
 * configuration that might be useful to customizing how cells in the column are
 * rendered.
 * </p>
 * <pre>
 * function currency(o) {
 *     return Y.DataType.Number.format(o.value, {
 *         prefix            : o.column.currencySymbol     || '$',
 *         decimalPlaces     : o.column.decimalPlaces      || 2,
 *         decimalSeparator  : o.column.decimalSeparator   || '.',
 *         thousandsSeparator: o.column.thousandsSeparator || ','
 *     });
 * }
 * 
 * var cols = [
 *     { key: "price", formatter: currency, decimalPlaces: 3 },
 *     ...
 * </pre>
 * 
 * @author sg
 * 
 */
public interface Formatter {
	String format(FormatterContext o);
}
