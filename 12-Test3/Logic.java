public class Logic {
    private Boolean[] mybool;

    public Logic(Boolean[] burh){
        this.mybool = burh;
    }

    public int opposite(){
        
        int counter = 0;
        
        for(int i=1;i<mybool.length-1;i++){
            if(mybool[i]!=mybool[i-1]&&mybool[i]!=mybool[i+1]){
                counter+=1;
            }
        }

        return counter;
    }

    public static void main(String[] args){
        
        Boolean[] b1 = {true,false,true,false};
        
        Logic l1 = new Logic(b1);
        System.out.println(l1.opposite());
    }
    
}
