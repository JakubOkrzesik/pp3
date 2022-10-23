public class rectangles {
    int side1;
    int side2;
    

    public void displayInfo(){
        
        int perimiter = side1 + side2;
        int surfaceArea = side1*side2;

        System.out.println("Dimensions: " + side1 + "x" + side2 + "\n"
        + "Perimiter: " + perimiter + "\n" + "Surface area: " + surfaceArea);
    }

    public static void main(String args[]){
        rectangles rect1 = new rectangles();
        rect1.side1 = 3;
        rect1.side2 = 4;
        rect1.displayInfo();
    }
}
