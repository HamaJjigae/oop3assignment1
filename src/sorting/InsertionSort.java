package sorting;

import java.util.Comparator;

import shapes.Shapes;

public class InsertionSort implements SortAlgos {

	@Override
	public void Sort(Shapes[]data, String sortType) 
	{
		{
			Comparator<Shapes> comparator = getComparator(sortType);
			
			if (comparator!= null)
			{
				for (int i = 1; i < data.length; i++)
				{
					Shapes key = data[i];
					int j = i - 1;
					
					while (j >= 0 && comparator.compare(data[j], key) < 0)
					{
						data[j+1] = data[j];
						j--;
					}
					data[j+1] = key;
				}
			} else
			{
				for (int i = 1; i < data.length; i++)
				{
					Shapes key = data[i];
					int j = i -1;
					
					while (j >= 0 && data[j].compareTo(key) < 0)
					{
						data[j + 1] = data[j];
						j--;
					}
					data[j+1] = key;
				}
			}
		}
	}
}
