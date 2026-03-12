package week8_interfaceHN;
public class Circle extends Shape implements ShapeCalculator{
    private double radius;
    
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calcArea(){
        double area = Math.PI * Math.pow(radius, 2.0);
        this.setArea(area);
        return area;
    }
    
    @Override
    public double calcPerimeter(){
        /*
        I 
        P
        O perimeter
        */
        //formula here
        return 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
