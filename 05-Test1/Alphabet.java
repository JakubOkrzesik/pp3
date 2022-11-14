import java.util.Arrays;


public class Alphabet {
    

    public boolean isAlphabet(String t){
        int n = t.length();
        

        char c[] = new char [n];


        for(int i=0; i<n; i++){
            c[i] = t.charAt(i);
        }

        Arrays.sort(c);

        for(int i = 0; i<n;i++){
            if (c[i]!=t.charAt(i)){
                return false;
            }
        }

        return true;

    }


    public static void main(String args[]){
        Alphabet a1 = new Alphabet();
        System.out.println(a1.isAlphabet("abcmhsw"));
    }
}
