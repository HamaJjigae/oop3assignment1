package shapes;

public class SquarePrism extends Shapes implements Comparable<Shapes> 
{
    private double edgeLength;

    public SquarePrism(double height, double edgeLength) 
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
        return (edgeLength * edgeLength * height);
    }

    @Override
    public double calcArea() 
    {
        return (edgeLength * edgeLength);
    }
}