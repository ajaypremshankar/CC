package algods.core;

import algo.search.BinarySearch;

public class Core {
	
	static ICore target = new BinarySearch();
	
	public static void main(String[] args) {
		target.execute();
	}
}
