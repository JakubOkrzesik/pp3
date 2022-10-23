public class Student{
    
    // Atrybuty
    String name;
    int age;
    int studentId;
    boolean idValidity;
    int semesterNum;
    double gradeAverage;
    
    
    // Zachowania
    
    public void sayHello(){
        System.out.println("Hello");
    }
    
    
    public void displayName(){
        System.out.println("My age is " + name);
    }
    
    public void displayAge(){
        System.out.println("My age is " + age);
    }
    
    
    public void displayDetails(){
        System.out.println("Name: " + name + "\n" + "Semester: " 
        + "\n" + gradeAverage);
    }
    
    public void changeIDStatus(){
        idValidity = !idValidity;
    }
    
    public void displayData(){
        System.out.println("Name: " + name + "ID: " 
        + studentId + "Valid: " + idValidity);
    }



    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Jakub";
        student1.age = 20;
        student1.studentId = 12345;
        student1.idValidity = true;
        student1.semesterNum = 2;
        student1.gradeAverage = 3.4;
        student1.displayData();
    }

}