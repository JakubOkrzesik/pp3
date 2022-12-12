import java.util.ArrayList;

public class Family {
    private ArrayList<Person> arr1 = new ArrayList<Person>();

    public Family(Person...people) {
        for(Person pers:people){
            arr1.add(pers);
        }
    }

    public int adults(){
        int counter=0;
        
        for(Person person : arr1){
            if(person.getAge()>=18){
                counter+=1;
            }
        }

        return counter;
    }


    public static void main(String args[]){
        Family f1 = new Family(new Person("Jakub", 20), new Person("Maria", 25), new Person("Lucjan", 5));
        System.out.println(f1.adults());
    }
}
