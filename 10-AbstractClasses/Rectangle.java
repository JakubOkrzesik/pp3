public class Rectangle extends Shape {
    private int a;
    private int b;
    
    
    
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }



    public int getA() {
        return a;
    }



    public int getB() {
        return b;
    }

    @Override
    public double area() {
        return a*b;
    }



    @Override
    public double perimeter() {
        return 2*a+2*b;
    }

    
}
