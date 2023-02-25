package com.simplilearn.sort.algorithm;


public class MergeSortExample {

  public static void main (String[] args) {
    int arr[] = {10, 4, 2, 15, 17, 5, 3, 1};

    int arrLength = arr.length;

    Merge m1 = new Merge();
    System.out.println("\nBefore sorting array elements are - ");
    m1.printArray(arr, arrLength);
    m1.mergeSort(arr, 0, arrLength - 1); // arr - 1st, 0 - beg, 7 - end
    System.out.println("\nAfter sorting array elements are - ");
    m1.printArray(arr, arrLength);
    System.out.println("");

  }

}
