package sorting;

import java.util.Comparator;
import shapes.Shapes;

public class QuickSort implements SortAlgos 
{

    @Override
    public void Sort(Shapes[] data, String sortType) 
    {
        Comparator<Shapes> comparator = getComparator(sortType); 
        quickSort(data, 0, data.length - 1, comparator);
    }

    private void quickSort(Shapes[] data, int low, int high, Comparator<Shapes> comparator) 
    {
        if (low < high) {
            int pi = partition(data, low, high, comparator);
            quickSort(data, low, pi - 1, comparator);
            quickSort(data, pi + 1, high, comparator);
        }
    }

    private int partition(Shapes[] data, int low, int high, Comparator<Shapes> comparator) 
    {
        Shapes pivot = data[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) 
        {
            boolean condition;
            if (comparator != null) 
            {
                condition = comparator.compare(data[j], pivot) > 0;
            } 
            else 
            {
                condition = data[j].compareTo(pivot) > 0;
            }

            if (condition) 
            {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, high);

        return i + 1;
    }
}