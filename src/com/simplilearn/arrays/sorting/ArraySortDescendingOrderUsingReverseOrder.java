package com.simplilearn.arrays.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDescendingOrderUsingReverseOrder {

	public static void main(String[] args) {
		
		Double[] array = {5.50, 2.50, 10.50, 7.50, 1.50};
		
		String[] strArray = {"Apple", "Banana", "Mango", "Cherry", "Papaya"}; 
		
		System.out.println("Array before sorting:: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		Arrays.sort(strArray, Collections.reverseOrder());
		
		
		System.out.println();
		
		System.out.println("Array after sorting:: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(strArray[i] + " ");
		}

	}

}
