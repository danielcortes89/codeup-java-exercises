package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner in = new Scanner(System.in);

        Student student1 = new Student("Enrique Martinez");
        Student student2 = new Student("Fraulein Hammersmark");
        Student student3 = new Student("Don Giovanni");
        Student student4 = new Student("Major Tom");

        student1.addGrade(91);
        student1.addGrade(74);
        student1.addGrade(87);

        student2.addGrade(60);
        student2.addGrade(79);
        student2.addGrade(60);

        student3.addGrade(96);
        student3.addGrade(97);
        student3.addGrade(98);

        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(100);

        students.put("quiqeM@github.com", student1);
        students.put("FHammer@github.com", student2);
        students.put("godfather@github.com", student3);
        students.put("gc2MT@github.com", student4);

        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students:");

        students.forEach((String, Student) -> System.out.println(Student.getName() + " - " + String));
        System.out.println("\n");

        askUser(students);

        System.out.println("Thanks for coming!");
    }

    static void askUser(HashMap students){
        Scanner in = new Scanner(System.in);

        System.out.println("Who do you want more information on? Enter username");
        String searchTerm = in.nextLine();



        if(students.containsKey(searchTerm)){
            Student student = (Student) students.get(searchTerm);

            System.out.println("Name: " + student.getName());
            System.out.println("Current GPA: " + student.getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with username " + searchTerm);
        }
        System.out.println("Want to search again?");
        String continueLoop = in.nextLine();

        if(continueLoop.equalsIgnoreCase("yes")){
            askUser(students);
        }
    }
}
