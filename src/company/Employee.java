package company;

public class Employee {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void employeeWork() {
        System.out.println("employee  " + this.name + " is working");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
