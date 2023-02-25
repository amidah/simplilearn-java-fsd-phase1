package com.simplilearn.sort.algorithm;


public class MergeSortExample {

  public static void main (String[] args) {
    int arr[] = {10, 4, 2, 15, 17, 5, 3, 1};

    System.out.print("Array before merge sort: ");

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    int arrLength = arr.length;

    Merge m1 = new Merge();
    System.out.println("\nBefore sorting array elements are - ");
    m1.printArray(arr, arrLength);
    m1.mergeSort(arr, 0, arrLength - 1);
    System.out.println("\nAfter sorting array elements are - ");
    m1.printArray(arr, arrLength);
    System.out.println("");

  }

}
