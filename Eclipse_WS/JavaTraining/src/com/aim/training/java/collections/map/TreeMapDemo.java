package com.aim.training.java.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		Map mp = new TreeMap();
		mp.put("Name", "Aravinda");
		mp.put("Age", "35");
		mp.put("Location","Bangalore");
		
		System.out.println(mp.get("Name"));
		System.out.println(mp.get("Age"));
		System.out.println(mp.get("Location"));
		
		
		pintMapValues(mp);
		
		System.out.println(mp.containsKey("Name1"));
	}

	private static void pintMapValues(Map mp) {
		Set keys = mp.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			String key = (String)it.next();
			System.out.println(key + " : " + mp.get(key));
		}
	}

}
