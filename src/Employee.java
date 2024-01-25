public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary){
        super();
    }

    public Employee(String position, double salary){
        this(name, surname, position, salary);
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double getPaymentAmount(){
        return salary;
    }
}
