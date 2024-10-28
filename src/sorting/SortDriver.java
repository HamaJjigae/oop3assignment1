package sorting;
import shapes.Shapes;
public class SortDriver
{
	public static void executeSort(String sortType, String sortingAlgo, Shapes[] data)
	{
		SortAlgos algorithm = null;
		switch (sortingAlgo) {
		    case "b":
		        algorithm = new BubbleSort();
		        break;
		    case "s":
		        algorithm = new SelectionSort();
		        break;
		    case "i":
		        algorithm = new InsertionSort();
		        break;
		    case "m":
		        algorithm = new MergeSort();
		        break;
		    case "q":
		        algorithm = new QuickSort();
		        break;
		    case "z":
		        algorithm = new HeapSort();
		        break;
		}
		algorithm.Sort(data, sortType);			
	}
}