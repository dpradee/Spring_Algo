/*
 * @SreenuTech 
 *  this code is secure and will not be exposed
 *  terms and condition must be applied
 */
package com.found.duplicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author pradeep dubey
 * @date   Nov 5, 2018
 */
public class DupicateFounder {
	static  String s1="ravishankar";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findDuplicate(s1);

	}
	/**
	 * @param s12
	 */
	private static void findDuplicate(String str) {
		String strn=str;
		String str2=null;
		char[] character = strn.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		// set the data into hashmap
		for(char ch: character) {
			/*if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				}
			else {
				map.put(ch, 1);
			}*/
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
				if(map.get(ch)>=2) {
				String str1=Character.toString(ch);
			    System.out.println(str1);
				 str2=str.replace(str1,"");
				 System.out.println(str2);
				 //str=str2;
				 
				}
			}
			else {
				map.put(ch, 1);
			}
		
		}
		System.out.println("DupicateFounder.findDuplicate()" +str);
		/*// get the data from map set
		Set<Entry<Character, Integer>> setmap = map.entrySet();
		for(Entry<Character, Integer> entry : setmap) {
			System.out.println("entry enters for " +entry.getKey()+"= "+entry.getValue());
		}*/
		
	}

}
