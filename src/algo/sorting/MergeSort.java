package algo.sorting;

import algods.core.ICore;

public class MergeSort implements ICore {

	int[] arr = { 10, 20, -1, 222220000, 5, 100, 45 };

	@Override
	public void execute() {

		sort(arr, 0, arr.length - 1);
	}

	private void sort(int[] arr2, int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;

			sort(arr2, low, mid);
			sort(arr, mid + 1, high);
			merge()
		}
	}

}
