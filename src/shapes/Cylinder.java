package shapes;

public class Cylinder extends Shapes implements Comparable<Shapes> 
{
    private double radius;

    public Cylinder(double height, double radius) 
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
        return (Math.PI * radius * radius * height);
    }

    @Override
    public double calcArea() 
    {
        return (Math.PI * radius * radius);
    }
}