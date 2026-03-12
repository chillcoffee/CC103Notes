package week8_interfaceIST;
public class Rectangle implements DimCalculator{
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calcArea(){
        double area = length * width;
        return area;
    }
    @Override
    public double calcPerimeter(){
        return 0.0;
    }
    @Override
    public double calcVolume(){
        return 0.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    

}
