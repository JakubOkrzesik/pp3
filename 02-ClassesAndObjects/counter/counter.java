public class counter {
    int counter = 0;

    public void increaseByOne(){
        counter=counter+1;
        System.out.println("The value is now " + counter);
    }

    
    public void decreaseByOne(){
        counter=counter-1;
        System.out.println("The value is now " + counter);
    }

    
    public void increaseByTen(){
        counter = counter + 10;
        System.out.println("The value is now " + counter);
    }

    
    public void decreaseByTen(){
        counter = counter - 10;
        System.out.println("The value is now " + counter);
    }

    public void reset(){
        counter = 0;
        System.out.println("The value has been reset");
    }

    public static void main(String args[]){
        counter mycount = new counter();
        mycount.increaseByTen();
        mycount.increaseByTen();
        mycount.increaseByOne();
        mycount.increaseByOne();
        mycount.increaseByOne();

    }
}
