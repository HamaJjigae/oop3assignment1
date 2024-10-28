package sorting;

import java.util.Comparator;
import shapes.Shapes;
import utilities.CompareArea;
import utilities.CompareVolume;

public interface SortAlgos 
{
	void Sort(Shapes[] data, String sortType);
	
    default Comparator<Shapes> getComparator(String sortType) 
    {
        switch (sortType) 
        {
            case "v":
                return new CompareVolume();
            case "h":
                return null;
            case "a":
                return new CompareArea();
            default:
                throw new IllegalArgumentException("Invalid sort type: " + sortType);
        }
    }
    
	default void swap(Shapes[] data, int i, int j) {
		Shapes temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}