package shapes;

public class TriangularPrism extends Shapes implements Comparable<Shapes> 
{
    private double edgeLength;

    public TriangularPrism(double height, double edgeLength) 
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
        return ((edgeLength * edgeLength * Math.sqrt(3)/4));
    }
}