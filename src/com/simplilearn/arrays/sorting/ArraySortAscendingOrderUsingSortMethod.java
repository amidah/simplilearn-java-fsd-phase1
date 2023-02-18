package com.simplilearn.arrays.sorting;

import java.util.Arrays;

public class ArraySortAscendingOrderUsingSortMethod {

	public static void main(String[] args) {
		
		int array[] = new int[] {10, 5, 8, 2, 20, 13, 30};
		
		System.out.println("Array before sorting:: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		Arrays.sort(array);
	
		System.out.println();
		
		System.out.println("Array after sorting:: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
