this package is the Java Api for : 

 * some YQL datatables concepts, for example, weather
 
 in all cases, for each datatable or datatable command, there exists a Java class 
 named  ${tableName}Result.java that is the root main entry point to access the data table. In some
 cases, where required, this ${tableName}Result.java class will provide with methods for normalizing the
 js object data, like for example 
 org.sgx.yuigwt.yui.yql.api.wheather.forecast.WheatherForecastResult::normalize
 
 These ${tableName}Results classes are provided for each yql table and are the main entry point for working with the concrete table api. 
 Instances of ${tableName}Results are the value of query.results property of returned json response from yql.