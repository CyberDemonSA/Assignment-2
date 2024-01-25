public class Student extends Person {
    private String position;
    private double gpa;

    public Student(){
        super();
    }

    public Student(String name, String surname, String position, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setGpa(gpa);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public double getPaymentAmount(){
        if (getGpa() > 2.67){ return 36660.00; }
        else { return 0.0;}
    }
}