package com.example.datastructure;

public class BubbleSort {

	boolean isSorted (int [] sortList, int size) {
		//boolean flag = true;
		for (int i = 0; i<size-1; i++) {
			if (sortList [i] > sortList [i+1]) {
				return false;
			}
		}
		return true;
	}
}

class BubbleSort1 extends BubbleSort{
	int [] nextIteration (int [] sortList, int index) {
		int temp;
		if (sortList [index] > sortList [index + 1]) {
			temp = sortList [index];
			sortList [index] = sortList [index + 1];
			sortList [index + 1] = temp;
		}
		return sortList;
	}
}
