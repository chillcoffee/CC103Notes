package week7_interfaceSM;
public class RunShape {
    public static void main(String[] args) {
        Circle circ = new Circle();
        Shape shape = new Circle();
        Shape shape2 = new Square();
        ShapeCalculator sc = new Circle();
        
        circ.setRadius(5525);        
        System.out.println("Volume of the sphere(circle): "+String.format("%.3f", circ.calcVolume()));
        
        
        
        
        
        

    }

}




//System.out.println("Area of the circle: "+circ.calcArea());        
//        Square sq = new Square();
//        sq.setSide(5);
//        System.out.println("Area of the square: "+sq.calcArea());
//        System.out.println("Volume of the cube (square): "+sq.calcVolume());
