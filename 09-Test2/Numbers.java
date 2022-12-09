import java.util.ArrayList;

public class Numbers {
    private ArrayList<Integer> myarray = new ArrayList<Integer>();

    public Numbers(Integer... args) {
        for(Integer arg : args){
            this.myarray.add(arg);
        }
    }

    public boolean different(){
        for(int i=0;i<this.myarray.size();i++){
            for(int j=0;j<this.myarray.size();j++){
                if(i==j){
                    continue;
                }
                else if(this.myarray.get(i)==this.myarray.get(j)){
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String args[]){
        Numbers mynums = new Numbers(3,4,4,1,6);
        System.out.println(mynums.different());
    }
    
}
