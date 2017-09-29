package com.yiibai.springmvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Client2 {
 
	public static void main(String[] args) {
		
		User u1=new User("Tom","24");
		User u2=new User("Tom","25");
		User u3=new User("Tom","26");
		User u4=new User("jack","35");
		User u5=new User("jack","36");
		List<User> list=new ArrayList<User>();
		list.add(u1);list.add(u2);list.add(u3);
		list.add(u4);list.add(u5);
		Map<String,Integer> map=new HashMap<String,Integer>();
		int count=0;
		for(int i=0;i<list.size();i++){
			if(map.containsKey(list.get(i).getName())){
				map.put(list.get(i).getName(), map.get(list.get(i).getName()).intValue()+1);
			}else{
				map.put(list.get(i).getName(), 1);
			}
		}
		Set<String> keys=map.keySet();
		for(String key:keys){
			System.out.println(key+" "+map.get(key).intValue());
		}
	}
}
