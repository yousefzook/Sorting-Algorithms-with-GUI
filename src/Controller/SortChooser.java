package Controller;

import SortingAlgorithms.BubbleSort;
import SortingAlgorithms.HeapSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.MergeSort;
import SortingAlgorithms.QuickSort;
import SortingAlgorithms.SelectionSort;
import SortingAlgorithms.ShellSort;

public class SortChooser {
	SelectionSort testS ;
    InsertionSort testI;
	MergeSort test ;
	QuickSort testQ ;
    HeapSort testH;
    ShellSort testSH;
    BubbleSort testB;

	public void Sort (String name , int[] unsorted){
		if (name.equals("Merge")){
			test = new MergeSort();
			test.mergeSort(unsorted, 0, unsorted.length - 1);

		}
		else if (name.equals("Quick")){
			testQ = new QuickSort();
			testQ.quickSort(unsorted, 0, unsorted.length - 1);

		}
		else if (name.equals("Selection")){
			testS = new SelectionSort();
			testS.selectionSort(unsorted);

		}
		else if (name.equals("Insertion")){
			testI = new InsertionSort();
			testI.insertionSort(unsorted);

		}
		else if (name.equals("Heap")){
			testH = new HeapSort();
			testH.Heap_Sort(unsorted);

		}
		else if (name.equals("Shell")){
			testSH = new ShellSort();
			testSH.shellSort(unsorted);

		}else if (name.equals("Bubble")){
			testB = new BubbleSort();
			testB.bubbleSort(unsorted);

		}

	}
	

}
