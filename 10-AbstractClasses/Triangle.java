public class Triangle extends Shape{
    private int a;
    private int h;
    private int b;
    private int c;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    
    public Triangle(int a, int h, int b, int c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }


    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    @Override
    
    
    public double area() {
        return a*h/2;
    }
    @Override
    public double perimeter() {
        return a+b+c;
    }

    
    
}
