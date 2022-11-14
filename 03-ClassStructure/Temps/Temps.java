public class Temps {
    

    public static double ConvertTemp(double temp, String conv){
        
        if (conv=="C:F"){
            return temp*9.0/5.0 + 32.0;
        }

        
        return temp*5.0/9.0 - 32.0;
        
    }

    public static void main(String args[])
    {
        System.out.println(ConvertTemp(60.0, "C:F"));
    }

}
