package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        Student student1 = new Student("Enrique Martinez");
        Student student2 = new Student("Enrique Martinez");

        student1.addGrade(100);
        student1.addGrade(0);
    }
    private String name;
    private ArrayList<Integer> grades;

    Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double average = 0;
        for(int grade : this.grades){
            average += grade;
        }
        return average / this.grades.size();
    }

}
