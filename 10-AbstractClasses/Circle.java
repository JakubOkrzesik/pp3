public class Circle extends Shape{
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(r, r);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }
    
    
    
}
