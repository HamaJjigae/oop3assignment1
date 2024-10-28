package shapes;

public abstract class Shapes implements Comparable<Shapes>
{
	protected double height;
	
	public Shapes(double height)
	{
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public abstract double calcVolume();
	public abstract double calcArea();
	
	@Override
	public int compareTo(Shapes other)
	{
		return Double.compare(this.height, other.height);
	}
	@Override
	public String toString() {
	    return "Shape: " + this.getClass().getSimpleName() + 
	           ", Height: " + height + 
	           ", Volume: " + calcVolume() + 
	           ", Area: " + calcArea();
	}
}
