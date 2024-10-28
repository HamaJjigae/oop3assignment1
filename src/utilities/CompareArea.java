package utilities;

import java.util.Comparator;
import shapes.Shapes;

public class CompareArea implements Comparator<Shapes>
{
	@Override
	public int compare (Shapes t1, Shapes t2)
	{
		return Double.compare(t1.calcArea(), t2.calcArea());
	}
}