public class Pizza extends Food implements Extra{
    private int size;

    public Pizza(String name, int size){
        super(name);
        this.size = size;
    }

    @Override
    public void setPrice() {
    }

    @Override
    public float delivery() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float delivery(int num) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float discount() {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
