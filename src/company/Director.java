package company;

import java.util.List;

public class Director extends Manager {
    private List<Employee> employees;
    private List<Manager> managers;

    public Director(String name, String surname) {
        super(name, surname);
    }

    public void managerMustWork() {
        for (int i = 0; i < managers.size(); i++) {
            Manager manager = managers.get(i);
            manager.managerWork();
        }
    }

    @Override
    public void employeeWork() {
        super.employeeWork();
    }

    @Override
    public void managerWork() {
        super.managerWork();
    }

    @Override
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
