package com.simplilearn.sort.algorithm;

public class Quick {
	
	// function that considers last element as the pivot, 
	// place the pivot at its exact position, and place smaller elements
	// to the left of the pivot and larger elements to the right of the pivot
	
	public int partition(int a[], int start, int end) {
		
		int pivot = a[end]; // pivot element
		int i = (start - 1);
		
		for (int j = start; j <= end - 1; j++) {
			if(a[j] < pivot) { // if current element is smaller than the pivot
				i++; // increment index of smaller element
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		
		int t = a[i + 1];
		a[i + 1] = a[end];
		a[end] = t;
		
		return (i + 1);
	} 
	
	void quick(int a[], int start, int end) {
		if(start < end) {
			int p = partition(a, start, end);
			quick(a, start, p - 1);
			quick(a, p + 1, end);
		}
	}
	
	/* Function to print the array */
	  void printArray(int a[], int n)
	  {
	    int i;
	    for (i = 0; i < n; i++)
	      System.out.print(a[i] + " ");
	  }


}
