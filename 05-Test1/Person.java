public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age){
        setName(name);
        setAge(age);
    }

    public void setName(String newname){
        name = newname;
    }   

    public String getname(){
        return name;
    }

    public void setAge(Integer newage){
        age = newage;
    }
    
    public Integer getAge(){
        return age;
    }
    
    public boolean isAdult(){
        return getAge()>=18;
    }

    public String toString(){
        return name + "," + age;
    }


    public static void main(String args[]){
    Person person1 = new Person("Anna", 21);
    System.out.println(person1);
    System.out.println(person1.isAdult());
    }
}
