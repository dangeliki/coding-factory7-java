package gr.aueb.cf.ch14;

public class Employee extends Person{

    private double salary;

//    Constructors
    public Employee() {

    }

    public Employee(long id, String firstname, String lastname, double salary) {
        super(id, firstname, lastname);
        this.salary = salary;
    }

//    Getters

    public double getSalary() {
        return salary;
    }

//    Setters

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    Κληρονομούμε τα public APIs απο το person και προσθετουμε πεδια αν θελουμε (λειτουργιες)
    @Override
    public void speak() {
        super.speak();
        System.out.println("Speaks a lot");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Also gets a salary");
    }
}
