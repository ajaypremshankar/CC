package algo.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {10, 20, -1, 222220000, 5, 100, 45};
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	void sort(int arr[]){
		
		for(int sortingIndex= 1; sortingIndex<arr.length; sortingIndex++){
			
			int keyToInsert = arr[sortingIndex];
			int iteratorOnSortedArray = sortingIndex-1;
			
			while(iteratorOnSortedArray>=0 && arr[iteratorOnSortedArray]>keyToInsert){
				arr[iteratorOnSortedArray+1] = arr[iteratorOnSortedArray];
				iteratorOnSortedArray--;
			}
			arr[iteratorOnSortedArray+1] = keyToInsert;
		}
		
	}
	
}
