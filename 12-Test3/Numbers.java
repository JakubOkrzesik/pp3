public class Numbers implements Ok{
    private int[] arr1;
    
    public Numbers(int[] arr1){
        this.arr1 = arr1;
    }

    @Override
    public boolean ok() {
        for(int i=2;i<this.arr1.length;i+=2){
            if(arr1[i]%2!=0){
                return false;
            }
        }
        return true;
    }

    

}
