package utilities;

import java.util.Comparator;
import shapes.Shapes;

public class CompareVolume implements Comparator<Shapes>
{
	@Override
	public int compare(Shapes t1, Shapes t2)
	{
		return Double.compare(t1.calcVolume(), t2.calcVolume());
	}
}
