public class Person{
    private String name;
    private String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return Character.toString(name.charAt(0)).toUpperCase() + Character.toString(surname.charAt(0)).toUpperCase();
    }
    public static void main(String[] args){
        Person p1 = new Person("Burh", "Moment");
        System.out.println(p1);
    }
}