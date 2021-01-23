package searchsort;

import java.util.Scanner;
//import static searchsort.SearchSort.quickSort;
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SearchSort s1  = new SearchSort();
		int arr[] = {12,5,38,19,7,56,21,55,87,24,8,17,2,3,1};
		int arr1[] = {13,6,37,53,15,55,64,23,22,19,34,58,5,3};
		int arr2[] = {6,8,12,14,42,46,22,20,18,4,2,0,26,54,58};
		int arr3[] = {4,12,60,16,28,54,15,52,10,0,5,2,1,91,7};
		int arr4[] = {14,26,40,54,68,82,96,95,80,65,50,35,20,5,77};
		int arr5[] = {1,27,54,55,22,10,7,2,9,21,14,51,60,87,77,88,98};
		
		
		try(Scanner sc = new Scanner(System.in)){
		
		
		System.out.println("\nEnter which element to search in array(Using Linear Search):-");
		int elem =sc.nextInt();
		if(s1.linearSearch(arr, elem)) 
		{
			System.out.println("Element Present..!"+" in "+arr);
		}
		else
		{
			System.out.println("Element Absent!");
		}
		
		System.out.println("Unsorted Array:--");
		s1.showArr(arr);
		
		System.out.println("\n\nBUBBLE SORT");
		s1.bubbleSort(arr);
		System.out.println("Sorted Array:--");
		s1.showArr(arr);
		
		System.out.println("\nEnter which element to search in array(Using Binary Search):-");
		int elem2 =sc.nextInt();
		
		
		if(s1.binarySearch(arr, elem2))
		{
			System.out.println("Element Present..!");
		}
		else
		{
			System.out.println("Element Absent!");
		}
		
		System.out.println("\n\nSELECTION SORT");
		s1.selectionSort(arr1);
		System.out.println("Sorted Array:--");
		s1.showArr(arr1);
		
		
		System.out.println("\n\nINSERTION SORT");
		s1.InsertionSort(arr2);
		System.out.println("Sorted Array:--");
		s1.showArr(arr2);
		
		
		System.out.println("\n\nMERGE SORT");
		s1.mergeSort(arr3, 0,arr3.length-1);
		System.out.println("Sorted Array:--");
		s1.showArr(arr3);
		
		
		System.out.println("\n\nQUICK SORT");
		s1.QuickSort(arr4, 0, arr4.length-1);
		System.out.println("Sorted Array:--");
		s1.showArr(arr4);
		
		System.out.println("\n\nHEAP SORT");
		s1.heapSort(arr5);
		System.out.println("Sorted Array:--");
		s1.showArr(arr5);
		
		
		}catch(Exception e) {
			
			e.getMessage();
		}
		
	}

}
