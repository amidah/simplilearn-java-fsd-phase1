package com.simplilearn.sort.algorithm;

public class SelectionSortExample {

	  public static void main (String[] args) {

	    int array[] = {9, 14, 3, 2, 43, 11, 58, 22};

	    System.out.print("Given Array before selection sort: ");

	    for (int i = 0; i < array.length; i++) {
	      System.out.print(array[i] + " ");
	    }

	    System.out.println();

	    selectionSort(array);


	    System.out.print("Given Array after selection sort: ");

	    for (int i = 0; i < array.length; i++) {
	      System.out.print(array[i] + " ");
	    }
	  }

	  private static void selectionSort(int array[]){

	    for(int i = 0; i < array.length - 1; i++){

	      int index = i;

	      for(int j = i + 1; j < array.length; j++){

	        if(array[j] < array[index]){
	          index = j; // searching for the smallest value index
	        }
	      }
	      int smallestNumber = array[index];
	      array[index] = array[i];
	      array[i] = smallestNumber;
	    }
	  }

	}