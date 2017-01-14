package algo.sorting;

public class BubbleSort {



	public static void main(String[] args) {
		int[] arr = {10,20, 5, 100};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(arr);
		
		for(int elem: arr){
			System.out.println(elem);
		}
	}
	
	
	void sort(int arr[]){
		
		for(int i= 0; i<arr.length-1; i++){
			
			for(int j = 0; j<arr.length-i-1; j++){
				if(arr[j]>arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
		
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
