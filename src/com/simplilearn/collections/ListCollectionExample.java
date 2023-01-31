package com.simplilearn.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListCollectionExample {

	public static void main (String[] args) {

	    // Syntax
	    // List<data type> name = new ArrayList<>();
	    // List<data type> name = new LinkedList<>();
	    // List<data type> name = new Vector<>();
	    // List<data type> name = new Stack<>();

	    // ArrayList - class which implements List Interface.
	    // It is dynamic in nature, we don't have to define the size during instantiation.
	    // The ArrayList class maintains the insertion order and is non-synchronized.
	    // The elements stored in the ArrayList class can be randomly accessed

	    List<String> friendsList = new ArrayList<String>();
	    friendsList.add("Sam"); //  0
	    friendsList.add("John"); // 1
	    friendsList.add("Sohan"); // 2
	    friendsList.add("Jack"); //  3
	    friendsList.add("Mavrick"); // 4
	    friendsList.add("Sam"); // 5
	    friendsList.add("John"); // 6
	    friendsList.add("Sohan"); // 7
	    friendsList.add("Jack"); // 8
	    friendsList.add("Mavrick"); // 9

	    System.out.println("My friends list is:: " + friendsList);

	    System.out.println("My friends names are given below::");

	    for(String name : friendsList){
	      System.out.println(name);
	    }

	    System.out.println("My best friend is:: " + friendsList.get(4));

	    List<Integer> numberList = new ArrayList<>();
	    numberList.add(1);
	    numberList.add(2);
	    numberList.add(3);

	    System.out.println("My numbers list is:: " + numberList);

	    System.out.println("The numbers are as follows:");
	    for(int number : numberList){
	      System.out.println(number);
	    }

	    List<String> namesLinkedList = new LinkedList<>();
	    namesLinkedList.add("A");
	    namesLinkedList.add("B");
	    namesLinkedList.add("C");
	    namesLinkedList.add("D");

	    System.out.println("Names Linked List:: " + namesLinkedList);

	    numberList.remove(0);
	    namesLinkedList.remove(0);

	    System.out.println("Numbers Array List:: " + numberList);
	    System.out.println("Names Linked List:: " + namesLinkedList);

	    if(friendsList.get(0).equals("Sam")){
	      System.out.println("Yes there is a match!!!");
	    }
	  }

}
