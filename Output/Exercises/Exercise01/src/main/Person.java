package main;

public class Person {
    private String fullname;
    private double Salary;

    public Person(String fullname, double salary) {
        this.fullname = fullname;
        this.Salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }
}
