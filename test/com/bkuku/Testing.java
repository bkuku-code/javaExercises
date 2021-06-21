package com.bkuku;

public class Testing {

    public static void main(String[] args) {

    }

    int firstName;
    int lastName;
    double salary;

    public Testing(int firstName, int lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public int getLastName() {
        return lastName;
    }

    public void setLastName(int lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String toDisplayDate() {
        return "Testing{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", salary=" + salary +
                '}';
    }
}

