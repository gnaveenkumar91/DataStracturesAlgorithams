package com.hashing;

import java.util.HashMap;

public class Ransom7 {

	public static void main(String[] args) {
		String ransom="abc";
		String magazine="baa";
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		for(int i=0;i<magazine.length();i++) {
			char ch=magazine.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		boolean result = true;
        for(int i=0;i<ransom.length();i++) {
        	char ch=ransom.charAt(i);
        	
        	if(!(map.containsKey(ch)) || map.get(ch)==0) {
                result = false;
                break;
        	}
        	map.put(ch,map.get(ch)-1);
        }
        System.out.println(map);
        System.out.println(result);
	}

}
