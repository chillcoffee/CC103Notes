package week7_interfaceSM;
public class Square extends Circle implements ShapeCalculator{
    
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double calcArea(){
        double area = side * side;
        return area;
    }
    
    @Override
    public double calcVolume(){
        double volume = side * side * side;
        return volume;
    }
    
    @Override
    public double calcPerimeter(){
        return side + side + side + side;
    }
}
