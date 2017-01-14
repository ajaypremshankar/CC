package algo.sorting;

public class SelectionSort {

	


	public static void main(String[] args) {
		int[] arr = {10,20, 5, 100};
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(arr);
		
		for(int elem: arr){
			System.out.println(elem);
		}
	}
	
	
	void sort(int arr[]){
		
		for(int i= 0; i<arr.length; i++){
			
			for(int j = i+1; j<arr.length; j++){
				
				if(arr[i]>arr[j]){
					swap(arr, i, j);
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
