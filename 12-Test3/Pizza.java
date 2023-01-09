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
    public float discount() {
        if(super.getPrice()>=30){
            Integer i = 5;
            return i.floatValue();
        }
        
        return 0;
    }

    @Override
    public float delivery() {
        if(size>=50){
            Integer i = 8;
            return i.floatValue();
        }
        Integer k = 6;
        return k.floatValue();
    }

    @Override
    public float delivery(int tip){
        if(size>=50){
            Integer i = 8;
            return i.floatValue();
        }
        Integer k = 6 + tip;
        return k.floatValue();
    }

    
}
