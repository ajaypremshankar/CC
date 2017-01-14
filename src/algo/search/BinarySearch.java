package algo.search;

import java.util.Arrays;

import algods.core.ICore;

public class BinarySearch implements ICore {

	private int[] arr = new int[] { 10, 20, 1, 0, 45, 98 };
	private int targetValue = 110;
	@Override
	public void execute() {

		Arrays.sort(arr);

		
		int indexAt = sort(arr, targetValue);
		System.out.println(targetValue + " is at index : " + indexAt + " in array : "
				+ Arrays.toString(arr));
	}

	private int sort(int[] arr, int targetValue) {

		int startIndex = 0, endIndex = arr.length-1;
		
		while(startIndex < endIndex){
			int mid = (startIndex+(endIndex-1))/2;
			
			if(arr[mid] == targetValue){
				return mid;
			}
			
			if(arr[mid]> targetValue){
				endIndex = mid;
			}else if (arr[mid]< targetValue){
				startIndex = mid+1;
			}
			
			
		}
		return -1;

	}

}
