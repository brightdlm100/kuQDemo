package kuQDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ReadFile {
public static void main(String[] args) throws Exception {
	BufferedReader bufferedReader=new BufferedReader(new FileReader("qq_flat.json"));
	String string=null;
	String json="";
	while((string=bufferedReader.readLine())!=null) {
		System.out.println(string);
		json+=string;
	}
	bufferedReader.close();
	JSONObject jb=JSON.parseObject(json);
	 JSONArray existedFriends=jb.getJSONObject("data").getJSONArray("friends");
	 BufferedWriter bWriter=new BufferedWriter(new FileWriter("existed_qq.txt"));
		for (int a=0;a<existedFriends.size();a++) {
			bWriter.write(existedFriends.getJSONObject(a).getString("user_id"));
			bWriter.newLine();
			System.out.println(existedFriends.getJSONObject(a).getString("user_id"));
		}
		bWriter.close();
}
	
}
