package algo.sorting;

import java.util.Arrays;

public class InsertionSortByBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, -1, 222220000, 5, 100, 45 };

		sort(arr);

		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int j = i - 1;
			int k = binarySearch(arr, 0, j, key);

			if (k > -1) {
				while (j >= k) {
					arr[j + 1] = arr[j];
					j--;
				}
				arr[k] = key;
			}

		}
	}

	private static int binarySearch(int[] arr, int startIndex, int endIndex,
			int key) {

		int mid = startIndex + (endIndex - startIndex) / 2;

		if (startIndex< endIndex) {

			if (key > arr[mid]) {
				return binarySearch(arr, mid + 1, endIndex, key);
			} else if (key < arr[mid]) {
				return binarySearch(arr, startIndex, mid, key);
			} else {
				return mid;
			}

		}
		return startIndex-1;
	}

}
