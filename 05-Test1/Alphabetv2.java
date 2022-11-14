public class Alphabetv2 {
    
    public static boolean isAlphabet(String t){
        for(int i = 1;i<t.length();i++){
            for(int j =0;j<t.length()-1;j++){
                if(t.charAt(i-1)>t.charAt(i)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String args[]){
        System.out.println(isAlphabet("abegsw"));
        System.out.println(isAlphabet("abcmhsw"));
    }
}
