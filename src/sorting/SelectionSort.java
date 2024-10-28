package sorting;

import java.util.Comparator;
import shapes.Shapes;

public class SelectionSort implements SortAlgos 
{
    @Override
    public void Sort(Shapes[] data, String sortType) 
    {
        Comparator<Shapes> comparator = getComparator(sortType); 

        for (int i = 0; i < data.length - 1; i++) 
        {
            int maxIndex = i;

            for (int j = i + 1; j < data.length; j++) 
            {
                boolean condition;
                if (comparator != null) 
                {
                    condition = comparator.compare(data[j], data[maxIndex]) > 0;
                } 
                else 
                {
                    condition = data[j].compareTo(data[maxIndex]) > 0;
                }

                if (condition) 
                {
                    maxIndex = j;
                }
            }
            swap(data, i, maxIndex);
        }
    }
}
