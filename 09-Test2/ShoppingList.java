import java.util.ArrayList;


public class ShoppingList {
    private ArrayList<Product> list1 = new ArrayList<Product>();

    public ShoppingList(Product... products) {
        for(Product product:products){
            list1.add(product);
        }
    }


    @Override
    public String toString(){
        
        ArrayList<String> results = new ArrayList<String>();
        
        for(int i=0;i<list1.size();i++){
            results.add(list1.get(i).getName());
        }

        return String.join(",",results);
    }

    public int total(){
        int results = 0;

        for(int i=0;i<list1.size();i++){
            results+=list1.get(i).getQuantity();
        }

        return results;
    }

    public static void main(String args[]){
        ShoppingList shop1 = new ShoppingList(new Product("apple", 4),new Product("carrot", 3));
        System.out.println(shop1);
        System.out.println(shop1.total());
    }    
}
