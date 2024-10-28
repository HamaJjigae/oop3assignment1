package shapes;

public class Pyramid extends Shapes implements Comparable<Shapes> 
{
    private double edgeLength;

    public Pyramid(double height, double edgeLength) 
    {
        super(height);
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() 
    {
        return edgeLength;
    }

    @Override
    public double calcVolume() 
    {
        return ((1.0/3.0) * edgeLength * edgeLength * height);
    }

    @Override
    public double calcArea() 
    {
        return (edgeLength * edgeLength);
    }
}