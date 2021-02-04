import java.util.Arrays;
public class ArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Daniel");
        people[2] = new Person("Fortran");
        for(Person n: people){
            System.out.println(n.getName());
        }
        people = addPerson(people, new Person("NewGuy"));
        for(Person n: people){
            System.out.println(n.getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person dude){
        int newLength = people.length + 1;
        Person[] newArray = Arrays.copyOf(people, newLength);
        newArray[newLength - 1] = dude;

        return newArray;
    }

}
