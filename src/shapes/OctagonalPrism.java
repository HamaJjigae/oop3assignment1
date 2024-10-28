package shapes;

public class OctagonalPrism extends Shapes implements Comparable<Shapes> 
{
    private double edgeLength;

    public OctagonalPrism(double height, double edgeLength) 
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
        return (calcArea() * height);
    }

    @Override
    public double calcArea() 
    {
        return (2 * (1 + (Math.sqrt(2)) * edgeLength * edgeLength));
    }
}