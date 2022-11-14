public class Product {
    private String name;
    private String type;
    
    Product(String newname, String foodType){
        setName(newname);
        setType(foodType);
    }

    public String getName(){
        return name;
    }

    public void setName(String newname){
        name = newname;
    }

    public String getType(){
        return type;
    }

    public void setType(String foodType){
        type = foodType;
    }

    public String toString(){
        return "Product name: " + name + "\n" + "Food type: " + type;
    }
    

    public static void main(String args[]){
        Product pro = new Product("Apple", "Vegetarian");
        System.out.println(pro);
    }
}
