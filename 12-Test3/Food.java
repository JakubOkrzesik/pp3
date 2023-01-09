public abstract class Food {
    private String name;
    private Float price;

    public Food(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public abstract void setPrice();
}
