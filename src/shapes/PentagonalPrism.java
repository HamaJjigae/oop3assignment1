package shapes;

public class PentagonalPrism extends Shapes implements Comparable<Shapes> 
{
    private double edgeLength;

    public PentagonalPrism(double height, double edgeLength) 
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
    	return ((5 * edgeLength * edgeLength * Math.tan(Math.toRadians(54)/4)));
    }
}