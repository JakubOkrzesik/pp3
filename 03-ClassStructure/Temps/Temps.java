public class Temps {
    

    public static double ConvertTemp(double temp, String conv){
        
        if (conv=="C:F"){
            return temp*9/5 + 32;
        }

        else if (conv=="F:C"){
            return temp*5/9 - 32;
        }
    }

    public static void main(String args[])
    {
        System.out.println(ConvertTemp(32, "XDD"));
    }

}
