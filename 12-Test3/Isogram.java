import java.util.Arrays;

public class Isogram {
    public static boolean isogr(String mystring){
        
        char[] charray = mystring.toCharArray();

        Arrays.sort(charray);
        
        for(int i=0; i<charray.length-1;i++){
            if(charray[i]==charray[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isogr("my blue water"));
    }
}
