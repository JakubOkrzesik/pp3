public class Product implements Comparable<Product>{
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public int compareTo(Product other) {
        if(getName().compareTo(other.getName())>0){
            return 1;
        }
        else if(getName().compareTo(other.getName())<0){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        Product p1 = new Product("Apple", 3.45);
        Product p2 = new Product("Carrot", 3.47);
        
        System.out.println("Compare to returns: " + p1.compareTo(p2));
        int result = p1.compareTo(p2);

        if(result<0){
            System.out.println(p1.getName() + "\n" + p2.getName());
        }
        
        
        else if(result>0){
            System.out.println(p2.getName() + "\n" + p1.getName());
        }

        else{
            System.out.println(p2.getName() + "and" + p1.getName() + "are the same products");
        }
    }

}
