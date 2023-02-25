package com.simplilearn.search.algorithm;

import java.util.Arrays;

public class ExponentialSearchExample {

	  public static void main (String[] args) {

	    int array[] = {10, 20, 30, 40, 50, 60, 70};

	    int length = array.length;

	    int firstIndex = 0;

	    int lastIndex = length - 1;

	    int valToSearch = 50;

	    System.out.print("Given Array: ");

	    for (int i = 0; i < length; i++) {
	      System.out.print(array[i] + " ");
	    }

	    System.out.println();

	    // As per exponential search algorithm, we need two steps:
	    // 1. Find the range where 20 is present
	    // 2. Perform binary search in that range

	    int result = exponentialSearch(array, length, valToSearch);

	    if(result < 0){
	      System.out.println(valToSearch + " is not found at any index");
	    }
	    else{
	      System.out.println(valToSearch + " is found at index: " + result);
	    }
	  }

	  private static int exponentialSearch(int[] array, int length, int valToSearch){

	    if(array[0] == valToSearch){
	      return 0;
	    }

	    // Find the range for binary search by repeated doubling
	    int i = 1;
	    while(i < length && array[i] <= valToSearch){
	      i = i * 2;
	    }


	    return Arrays.binarySearch(array, i/2, Math.min(i, length - 1), valToSearch);
	  }

	}