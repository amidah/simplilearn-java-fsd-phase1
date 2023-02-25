package com.simplilearn.search.algorithm;

public class LinearSearchExample {

	  public static void main (String[] args) {

	    int[] arr = {10, 20, 30, 40 , 50, 60, 70, 80, 90};

	    // Let's find the index of 70
	    int value = 100;

	    System.out.print("Given Array: ");

	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }

	    int searchIndex = linearSearch(arr, value);

	    System.out.println();

	    if(searchIndex != -1){
	      System.out.println("The index of " + value + " is: " + searchIndex);
	    }
	    else {
	      System.out.println("The index of " + value + " not found in given array");
	    }

	  }

	  private static int linearSearch(int[] array, int value){

	    for(int i = 0; i < array.length; i++){
	      if(array[i] == value){
	          return i;
	      }
	    }
	    return -1;
	  }
	}
