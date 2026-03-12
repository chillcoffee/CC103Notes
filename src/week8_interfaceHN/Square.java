package week8_interfaceHN;

public class Square implements ShapeCalculator {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calcArea(){
        return 0;
    }

    @Override
    public double calcPerimeter(){
        /*
        I side
        P perimeter = 4 * side ;
        O perimeter
        */
        double perimeter = 4 * side;
        return perimeter;
    }
    @Override
    public double calcVolume(){
        return 0.0;
    }

}
