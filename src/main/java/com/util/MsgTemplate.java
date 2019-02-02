package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sobte.cqp.jcq.entity.CoolQ;
import com.sobte.cqp.jcq.entity.Group;

public class MsgTemplate {
	
	public static void SayHi(long fromQQ, CoolQ CQ,long qq, String msg) {
		String[] word=msg.split("-");
	    List<String> words=new ArrayList<String>();
	    for (String string : word) {
			words.add(string);
		}
	    words.remove(0);
		for (String string : words) {
			int a=CQ.sendPrivateMsg(qq,string);
			if(a<0) {
				CQ.logError("Msg", "对"+qq+"发送消息失败！");
				return;
			}
		}
	}
	public static void GroupSay(long fromQQ, String msg, CoolQ CQ, Group group) {
		String[] word=msg.split("-");
	    List<String> words=new ArrayList<String>();
	    for (String string : word) {
			words.add(string);
		}
	    words.remove(0);
		for (String s : words) {
			int a=CQ.sendGroupMsg(group.getId(), s);
			if(a<0) {
				CQ.logError("Msg", "对群"+group.getId()+"发送消息失败！");
				CQ.sendPrivateMsg(fromQQ, "对群"+group.getId()+"发送消息失败！");
				return;
			}
		}
	}

}
