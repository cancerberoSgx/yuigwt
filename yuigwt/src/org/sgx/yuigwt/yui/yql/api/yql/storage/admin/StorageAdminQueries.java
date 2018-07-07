package org.sgx.yuigwt.yui.yql.api.yql.storage.admin;

public class StorageAdminQueries {
public static final String newRecordValue(String value) {
	return "insert into yql.storage.admin (value) values (\""+value+"\") "; 
}
}
