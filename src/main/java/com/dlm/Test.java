package com.dlm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;


import org.jsoup.Connection.Response;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.util.HttpclientUtil;

public class Test {
	public static void main(String[] args) throws IOException, InterruptedException {
		HashMap<String, String> cookies=new HashMap<String,String>();
		HashMap<String, String> data=new HashMap<String,String>();
		String  s="@@@@@";
		String t="";
		for(int i=0;i<100;i++) {
            t=s.replaceAll("@",""+ i+"");
			System.out.println(t);
		}
		//Response res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/send_private_msg?user_id=1323862811&message=hi", cookies, data);
		//res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/send_private_msg?user_id=169456216&message=hi", cookies, data);
		// res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/get_group_member_info?group_id=315439363&user_id=2275105690", cookies, data);
		 //res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/get_cookies", cookies, data); 
		// res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/get_credentials", cookies, data); 
		 //res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/get_status", cookies, data); 
		 //res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/set_restart", cookies, data); 
		// res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/_get_friend_list?flat=true ", cookies, data); 
		// res=HttpclientUtil.requestUrl(1, "get","http://127.0.0.1:5700/_get_group_info?group_id=315439363", cookies, data); 
      //  JSONObject json=JSON.parseObject(res.body());
		
		//System.out.println(json.getJSONObject("data").getJSONArray("friends"));
		/*String msg="获取群好友-area=-num=100";
		int a1=msg.indexOf("-");
	    int b=msg.indexOf("area=")+5;
	    int a2=msg.indexOf("-", b);
	    int b2=msg.indexOf("num=")+4;
	    String area=msg.substring(b, a2);
	    String num=msg.substring(b2);
	    System.out.println(area);System.out.println(num);*/
		/*BufferedWriter bw=null;
		try {
			 bw= new BufferedWriter(new FileWriter("qq-"+1+".txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0;i<100;i++) {
			try {
				bw.write("111");
				Thread.sleep(100);
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				System.err.println("无法写入！");
			}
		}*/

	/*	File file = new File("newfile.txt");
		FileOutputStream fop = new FileOutputStream(file);

		   // if file doesnt exists, then create it
		   if (!file.exists()) {
		    file.createNewFile();
		   }
		   for(int i=0;i<100;i++) {
		   // get the content in bytes
		    byte[] contentInBytes =( i+"\r\n").getBytes();
		  
		   fop.write(contentInBytes);
		   Thread.sleep(100);
		   }
		   fop.flush();
		   fop.close();*/
				
	}
}
