package com.simplilearn.arrays.range;

import java.util.ArrayList;

public class ArrayRange {
	
	public static void main(String[] args) {
		int array[] = new int[] {10, 5, 8, 2, 20, 13, 30, 11, 15, 19};
		
		int n = array.length;
		
		ArrayList<Query> arrayQueryList = new ArrayList<>();
		arrayQueryList.add(new Query(0, 4));
		arrayQueryList.add(new Query(1, 3));
		arrayQueryList.add(new Query(2, 4));
		
		int m = arrayQueryList.size();	
		
		printQuerySums(array, n, arrayQueryList, m);
		
	}
	
	private static void printQuerySums(int array[], int arrLength, ArrayList<Query> arrQueryLst, int sizeQL) {
		
		for(int i = 0; i < sizeQL; i++) {
			// Left and Right boundaries of current range
			int L = arrQueryLst.get(i).L; 
			int R = arrQueryLst.get(i).R;
			
			// Compute the sum of current range query
			int sum = 0;
			for(int j = L; j <= R; j++) {
				sum = sum + array[j];
			}
			System.out.println("Sum of [" + L + ", " + R + "] is " + sum);
			
		}
		
	}

}
