
/**
 * Write a description of class SurfaceArea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SurfaceArea
{
    // instance variables - replace the example below with your own
    

    public static double circleSurface(int r){
        double surface = 3.14*r*r;
        
        return surface;
    }

    public static int rectangleSurface(int a, int b){
        int surface = a*b;
        return surface;
    }
    
    public static int triangleSurface(int a, int h){
        int surface = (a*h)/2;
        return surface;
    }
    
    
    public static void main(String args[])
    {
        System.out.println(circleSurface(5));
        System.out.println(rectangleSurface(5, 6));
        System.out.println(triangleSurface(3, 6));
    }
}
