package org.sgx.gwtjavatools;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractModuleJson {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	sb.append("["); 
	String rootPath = "/home/sebastian/Desktop/yui-yui3-38da169/"; 
	try {
		extractAllModulesJson(sb, rootPath);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return; 
	}	
	sb.append("]"); 
	System.out.println(sb.toString());
}

private static void extractAllModulesJson(StringBuffer sb, String rootPath) throws Exception {
	String srcPath = rootPath+"src"; 
	File srcFolder = new File(srcPath);
	if(!srcFolder.isDirectory())
		throw new Exception(srcFolder.getAbsolutePath()+" - not a folder. ");
	String[] modFolders = srcFolder.list();
	for (int i = 0; i < modFolders.length; i++) {
		String modname = modFolders[i]; 
		String app_json_path = srcPath+File.separator+modname+File.separator+"meta"+File.separator+modname+".json";
		File app_json = new File(app_json_path); 
		if(app_json.exists()) {
			readFile(sb, app_json);
			if(i<modFolders.length-1)
				sb.append(", "); 
		}
//		String modPath = srcPath+File.separator+modname;
//		File modFolder = new File(modPath);  
	}
}

private static void readFile(StringBuffer sb, File f) throws IOException {
	FileInputStream fstream = new FileInputStream(f);
    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String str;
    while ((str = br.readLine()) != null) {
      sb.append(str); 
      sb.append("\n"); 
    }
    in.close();
}


}
