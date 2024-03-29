public abstract class Person implements Payable, Comparable<Person> {
    private static int id_gen = 0;
    private final int id;
    private String name;
    private String surname;

    public Person(){
        id=id_gen++;
    }

    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() { return surname; }

    public abstract String getPosition();

    @Override
    public String toString() {
        return getPosition() + ": " + getId() + ". " + getName() + " " + getSurname();
    }

    @Override
    public int compareTo(Person other){
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
