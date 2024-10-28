package sorting;

import shapes.Shapes;
import java.util.Comparator;

public class HeapSort implements SortAlgos 
{

    @Override
    public void Sort(Shapes[] data, String sortType) 
    {
        Comparator<Shapes> comparator = getComparator(sortType);

        int n = data.length;
        for (int i = n / 2 - 1; i >= 0; i--) 
        {
            heaping(data, n, i, comparator);
        }

        for (int i = n - 1; i > 0; i--) 
        {
            swap(data, 0, i);
            heaping(data, i, 0, comparator);
        }
    }

    private void heaping(Shapes[] data, int n, int i, Comparator<Shapes> comparator) 
    {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < n) 
        {
            if (comparator != null) 
            {
                if (comparator.compare(data[left], data[smallest]) < 0) 
                {
                    smallest = left;
                }
            } 
            else 
            {
                if (data[left].compareTo(data[smallest]) < 0) 
                {
                    smallest = left;
                }
            }
        }


        if (right < n) 
        {
            if (comparator != null) 
            {
                if (comparator.compare(data[right], data[smallest]) < 0) 
                {
                    smallest = right;
                }
            } 
            else 
            {
                if (data[right].compareTo(data[smallest]) < 0) 
                {
                    smallest = right;
                }
            }
        }

        if (smallest != i) 
        {
            swap(data, i, smallest);
            heaping(data, n, smallest, comparator);
        }
    }
}