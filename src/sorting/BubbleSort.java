package sorting;

import java.util.Comparator;

import shapes.Shapes;

public class BubbleSort implements SortAlgos {

	@Override
	public void Sort(Shapes[] data, String sortType) 
	{
		Comparator<Shapes> comparator = getComparator(sortType);
		
		boolean swapped;
		int n = data.length;
		
		if (comparator!= null)
		{
			for (int i = 0; i < n; i++)
			{
				swapped = false;
				for (int j = 0; j < n - i -1; j++)
				{
					if (comparator.compare(data[j], data[j + 1]) < 0)
					{
						swap(data, j, j + 1);
						swapped = true;
					}
				}
				if (!swapped) break;
			}
		} else
		{
			for (int i = 0; i < n - 1; i++) {
				swapped = false;
				for (int j = 0; j < n - i - 1; j++) 
				{
					if ((data[j]).compareTo(data[j + 1]) < 0)
					{
						swap(data, j, j + 1);
						swapped = true;
					}
				}
				if (!swapped) break;
			}
		}
	}
}
