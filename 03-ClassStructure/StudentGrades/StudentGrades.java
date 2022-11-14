import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Random;



public class StudentGrades {

    String studentName;
    int numberOfGrades;
    double[] grades;

    public void randomGrades(int numberOfGrades){
        double[] array = new Random().doubles(1,5).limit(numberOfGrades).toArray();
        double[] out = new double[array.length];
        for (int i=0; i < array.length; i++){
            out[i] = Math.round(array[i]*2) / 2.0;
        }

        grades = out;
    }

    public double ChooseMin(){
        DoubleSummaryStatistics stat = Arrays.stream(grades).summaryStatistics();
        return stat.getMin();
    }
    
    public double ChooseMax(){
        DoubleSummaryStatistics stat = Arrays.stream(grades).summaryStatistics();
        return stat.getMax();
    }

    public double GradeAverage(){
        DoubleSummaryStatistics stat = Arrays.stream(grades).summaryStatistics();
        return stat.getAverage();
    }
    
    public void DisplayInfo(){
        System.out.println("Name: " + studentName + "\n" + "Grades: " + Arrays.toString(grades) + "Lowest grade: "
        + ChooseMin() + "\n" + "Highest grade: " + ChooseMax() + "Average: " + GradeAverage());
    }
    
    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        this.numberOfGrades = numberOfGrades;
        randomGrades(numberOfGrades);
    }

    public static void main(String args[]){
        StudentGrades schoolInfo = new StudentGrades("Amanda", 5);
        schoolInfo.DisplayInfo();
    }

}
