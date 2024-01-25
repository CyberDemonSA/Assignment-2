import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String name = scanner.next();
            String surname = scanner.next();
            String position = scanner.next();

            if (Objects.equals(position, "Student")) {
                double gpa = scanner.nextDouble();
                Student student = new Student(name, surname, position, gpa);
                people.add(student);
            }
            else{
                double salary = scanner.nextDouble();
                Employee employee = new Employee(name, surname, position, salary);
                people.add(employee);
            }

            Collections.sort(people);

            printData(people);
            System.out.println();
        }
    }


    public static void printData(Iterable<Person> people){
        for (Person person : people){
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}