class Counter {
    private int counter;
    protected Counter(int c){counter=c;}
    public void add1(){counter++;}
    public int getCounter(){return counter;}
    public void setCounter(int value){counter=value;}
  }

class SuperCounter extends Counter{
    
    SuperCounter(int initial){
      super(initial);
    }

    public void addN(int n){
      super.setCounter(n);
    }
}
  