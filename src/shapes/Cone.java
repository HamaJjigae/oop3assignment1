package shapes;

public class Cone extends Shapes implements Comparable<Shapes>
{
	private double radius;
	
	public Cone(double height, double radius)
	{
		super(height);
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}

	@Override
	public double calcVolume() 
	{
		return (Math.PI * radius * radius * height * (1.0/3.0));
	}

	@Override
	public double calcArea() 
	{
		return (Math.PI * radius * radius);
	}
}