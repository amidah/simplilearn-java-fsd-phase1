package com.simplilearn.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionExample {

	public static void main(String[] args) {
		
		System.out.println("========");
		System.out.println("HASHSET");
		System.out.println("========");
		
		Set<String> hashSet = new HashSet<>();
		
		System.out.println(hashSet.add("Alex"));
		System.out.println(hashSet.add("John"));
		System.out.println(hashSet.add("Sam"));
		System.out.println(hashSet.add("Rob"));
		System.out.println(hashSet.add("Alex"));
		System.out.println(hashSet.add(null));
		System.out.println(hashSet.add(null));
		
		System.out.println("HashSet ==> " + hashSet);
		
		Iterator<String> setItr = hashSet.iterator();
		
		while(setItr.hasNext()) {
			System.out.println(setItr.next());
		}
//		
//		hashSet.clear();
//		
//		System.out.println("hashSet after clear() ==> " + hashSet);
		
//		System.out.println(hashSet.removeAll(hashSet));
//		
//		System.out.println("hashSet after removeAll() ==> " + hashSet);
//		
		System.out.println(hashSet.remove(null));
		
		System.out.println("hashSet after remove() ==> " + hashSet);
//		
		System.out.println(hashSet.removeIf(str -> str.contains("o")));
		
		System.out.println("hashSet after removeIf() ==> " + hashSet);
		
		for(String s : hashSet) {
			System.out.println(s);
		}
//
//		System.out.println(hashSet);
	
		System.out.println("==============");
		System.out.println("LINKEDHASHSET");
		System.out.println("==============");
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add(null);
		linkedHashSet.add("Chess");
		linkedHashSet.add("Cricket");
		linkedHashSet.add("Basketball");
		linkedHashSet.add("Volleyball");
		linkedHashSet.add("Football");
		
		System.out.println("linkedHashSet ==> " + linkedHashSet);
		
		linkedHashSet.remove("Basketball");
		linkedHashSet.removeAll(linkedHashSet);
		linkedHashSet.clear();
		
		System.out.println("linkedHashSet after removal:: " + linkedHashSet);
		
		
		
		System.out.println("==============");
		System.out.println("TREESET");
		System.out.println("==============");
	
		Set<String> sortedTreeSet = new TreeSet<>();
		sortedTreeSet.add("Riya");
		sortedTreeSet.add("Bob");
		sortedTreeSet.add("Alex");
		sortedTreeSet.add("Chad");
		
		System.out.println(sortedTreeSet);
	
	
	
	}

}
