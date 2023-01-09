import java.util.ArrayList;

public class Cities {
    private String[] citynames;

    public Cities(String[] citynames) {
        this.citynames = citynames;
    }

    public Cities filter(char a){
        
        ArrayList<String> a1 = new ArrayList<String>();

        for(String city: citynames){
            if(city.charAt(0)==a){
                a1.add(city);
            }
        }

        this.citynames = a1.toArray(new String[a1.size()]);

        return this;
    }

    public String cities(){
        return String.join("",this.citynames);
    }


    public static void main(String[] args){
        String[] c = {"Warszawa","Sopot","Kielce","Szczecin"};
        
        Cities c1 = new Cities(c);
        System.out.println(c1.filter('S').cities());
    }
}
