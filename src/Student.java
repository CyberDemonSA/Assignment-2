import java.security.PublicKey;

public class Student extends Person {
    private String position;
    private double gpa;

    public Student(){
        super();
    }

    public Student(String position, double gpa){
        this();
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

    public double getPaymentAmount(){
        double stipend;
        if (gpa > 2.67){ stipend = 36660.00; }
        else { stipend = 0;}
        return stipend;
    }
}