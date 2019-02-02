package com.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class FileUtil {

	
	public  static Properties getProperties() throws Exception {
		//System.out.println(FileUtil.class.getClassLoader().getResource("/").getPath());
		System.out.println("获取项目路径:"+System.getProperty("user.dir"));
		//System.out.println(Thread.class.getClassLoader().getResource("").getPath());
		//InputStream in = Thread.class.getClassLoader().getResourceAsStream("/qq.properties");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/qq.properties"));
		Properties props = new Proper();
		//InputStreamReader inputStreamReader = new InputStreamReader(in, "UTF-8");
		props.load(bufferedReader);
/*for (String key : props.stringPropertyNames()) {
            System.out.println( props.getProperty(key)+ "=" +key);
        }*/
        return props;
	}
	
	

}
