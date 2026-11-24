package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams11 {

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		HashMap<String, List<String>>map=new HashMap<String, List<String>>();
		
		for(int i=0;i<strs.length;i++) {
			String word=strs[i];
			char[] ch=word.toCharArray();
			Arrays.sort(ch);
			String key=new String(ch);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(word);
		}
		System.out.println(map);

	}

}
