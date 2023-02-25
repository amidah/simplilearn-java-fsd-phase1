package com.simplilearn.search.algorithm;

public class BinarySearchExample {

	  public static void main (String[] args) {
	    int[] array = {10, 20, 30, 40, 50, 60, 70};

	    int value = 60;

	    int firstIndex = 0;

	    int lastIndex = array.length - 1;

	    binarySearch(array, firstIndex, lastIndex, value);

	  }

	  private static void binarySearch(int[] array, int firstIndex, int lastIndex, int value){

	    int midIndex = (firstIndex + lastIndex) / 2;

	    while(firstIndex <= lastIndex){
	      if(array[midIndex] < value){
	          firstIndex = midIndex + 1;
	      }
	      else if(array[midIndex] == value){
	        System.out.println(value + " is found at index: " + midIndex);
	        break;
	      }
	      else{
	        lastIndex = midIndex - 1;
	      }
	      midIndex = (firstIndex + lastIndex) / 2;
	    }

	    if(firstIndex > lastIndex){
	      System.out.println(value + " is not found at any index");
	    }

	  }

	}

