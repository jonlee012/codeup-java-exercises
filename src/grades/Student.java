package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private ArrayList<Integer> grade;
    private Student(String name){
        this.name = name;
        this.grade = new ArrayList<>();
    }

    public void addGrade(int grades) {
        this.grade.add(grades);
    }
    public String getName() {
        return this.name;
    }

    public double getGradeAverage() {
        double total = 0;
        double sum = 0;
        for (int i = 0; i < grade.size(); i++) {
            total += grade.get(i);
            sum = total / grade.size();
        }
        return sum;
    }
    public double getGrades(String name) {
        double grades = 0;
        for (int i = 0; i < grade.size(); i++) {
            grades = grade.get(i);
            System.out.println(name +  "'s grades are " + (i + 1)  + grades);
        }
        return grades;
    }
    public void main(String[] args) {
        Student jon = new Student("Jon");
        System.out.println(getName());
        jon.addGrade(90);
        jon.getGrades(jon.getName());

        System.out.println(jon.getName());
        System.out.println(jon.getGradeAverage());

    }


}
