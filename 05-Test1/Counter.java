public class Counter {
    private Integer counter = 0;

    public void increase(){
        counter = counter + 1;
    }

    public void decrease(){
        counter = counter-1;
    }

    public void increase(int a){
        counter = counter + a;
    }

    public void decrease(int b){
        counter = counter-b;
    }

    public Integer value(){
        return counter;
    }

    public static void main(String args[]){
        Counter c = new Counter();
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());
    }
}

