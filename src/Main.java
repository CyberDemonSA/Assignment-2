import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String name = scanner.next();
            String surname = scanner.next();
            String position = scanner.next();

            if (position == "Employee"){
                double salary = scanner.nextDouble();
                people.add(new Employee(name, surname, position, salary));
            }
            if (position == "Student"){
                double gpa = scanner.nextDouble();
                people.add(new Employee(name, surname, position, gpa));
        }
    }
}