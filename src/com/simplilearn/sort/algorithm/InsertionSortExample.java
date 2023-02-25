package com.simplilearn.sort.algorithm;

public class InsertionSortExample {

	  public static void main (String[] args) {
	    int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};

	    System.out.print("Array before insertion sort: ");

	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }

	    System.out.println();
	    insertionSort(arr);

	    System.out.print("Array after insertion sort: ");

	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	  }

	  private static void insertionSort(int[] array){

	    int length = array.length;

	    for(int j = 1; j < length; j++){
	      int value = array[j];
	      int i = j - 1;
	      while((i > -1) && (array[i] > value)){
	          array[i + 1] = array[i];
	          i--;
	      }
	      array[i+1] = value;

	    }


	  }

	}