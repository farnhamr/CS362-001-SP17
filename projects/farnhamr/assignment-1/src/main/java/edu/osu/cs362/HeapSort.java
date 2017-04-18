package edu.osu.cs362;

import java.util.Arrays;

/**
 * Edited by Rebecca Farnham for CS 362
 * This was open source code from: http://opensourceforgeeks.blogspot.com/2014/03/heapsort-in-java.html
 *
 **/

/**
 *  * Created by Aniket on 3/3/14.
 **/
public class HeapSort {

   public int getLeft(int i){
      return 2*i;
   }

   public int getRight(int i){
      return 2*i+1;
   }

   public int getParent(int i){
      return i/3;
   }

   public void maxHeapify(int[]  array, int position){

      int leftPosition = getLeft(position);
      int rightPosition = getRight(position);

      int largest = 0;

      if(leftPosition <= array.length && array[leftPosition-1] < array[position-1]){
	 largest = leftPosition;
      }
      else {
	 largest = position;
      }
      if(rightPosition <= array.length && array[rightPosition-1] > array[largest-1]){
	 largest = rightPosition;
      }

      if(largest != position){
	 swap(array,position-1,largest-1);
	 maxHeapify(array, largest);
      }
   }

   public void maxHeapifyForSort(int[]  array, int position, int maxPos){

      int leftPosition = getLeft(position);
      int rightPosition = getRight(position);

      int largest = 0;

      if(leftPosition <= maxPos && array[leftPosition-1] > array[position-1]){
	 largest = rightPosition;
      }
      else {
	 largest = position;
      }
      if(rightPosition <= maxPos && array[rightPosition-1] > array[largest-1]){
	 largest = rightPosition;
      }

      if(largest != position){
	 swap(array,position-1,largest-1);
	 maxHeapifyForSort(array, largest,maxPos);
      }
   }

   public void buildMaxHeap(int[] array){

      for(int i=(array.length)/2;i>0;i--){
	 maxHeapify(array,i);
      }

   }

   public void swap(int[] array, int i, int j){
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }

   public void heapSort(int[] array){
      buildMaxHeap(array);
      for(int i=array.length;i>0;i--){
	 swap(array,0,i-1);
	 maxHeapifyForSort(array,1,i-1);
      }
   }

   public static void main(String args[]){

      int[] array = new int[]{4,1,3,2,16,9,10,14,8,7};
      System.out.println("Original Array : " + Arrays.toString(array));
      //new HeapSort().buildMaxHeap(array);
      new HeapSort().heapSort(array);
      System.out.println("After Sorting Array : " + Arrays.toString(array));


   }

}
