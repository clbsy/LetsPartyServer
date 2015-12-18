package com.Parteam.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Parteam.model.PartyItem;

@Controller
public class PartyItemController {
	class Data {
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		public String getStr() {
			return str;
		}
		public void setStr(String str) {
			this.str = str;
		}
		int i = 0;
		String str = "hello";
	}
	
	@RequestMapping("/welcome")
	@ResponseBody 
	public Object getPartyItem(){
		System.out.println("spring mvc hello world!"); 
        PartyItem party = new PartyItem();
        party.setiD(0001);
        party.setTopical("体育运动");
        party.setHolderID(1000);
        party.setOrg_tel("13000000000");
        return party;  
	}
}
