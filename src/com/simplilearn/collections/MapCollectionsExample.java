package com.simplilearn.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollectionsExample {

	public static void main(String[] args) {
		
		System.out.println("================");
		System.out.println("HASHMAP");
		System.out.println("================");
		
		Map<String, String> hashMap = new HashMap<>();
		
		System.out.println(hashMap.put("ID001", "Rony"));
		System.out.println(hashMap.put("ID002", "James"));
		System.out.println(hashMap.put("ID003", "Adam"));
		System.out.println(hashMap.put("ID004", "Golfer"));
		System.out.println(hashMap.put("ID001", "Semina"));
		System.out.println(hashMap.put("ID002", "Michael"));
		System.out.println(hashMap.put("ID003", "Tim"));
		System.out.println(hashMap.put("ID004", "Sohan"));
		System.out.println(hashMap.put("ID005", null));
		System.out.println(hashMap.put("ID006", null));
		System.out.println(hashMap.put(null, "Roy"));
		System.out.println(hashMap.put(null, "Sakhi"));
		
		System.out.println("Hash Map:: " + hashMap);
		
		for(Map.Entry m : hashMap.entrySet()){
		}
		
		
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		
		Map<String, String> treeMap = new TreeMap<>();

	}

}
