package pl.kedrabartosz.company;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("tomek", "Karas");
        employee.employeeWork();

        Manager manager = new Manager("radek", "biernacki");
        manager.managerWork();
        List<Employee> employeeList;
        employeeList = new ArrayList<>();
        employeeList.add(employee);
        manager.setEmployees(employeeList);
        manager.employeeMustWork();

        Director director = new Director("Radek", "Tomaszewski");
        List<Manager> managerList;
        managerList = new ArrayList<>();
        managerList.add(manager);
        director.setManagers(managerList);
        director.managerMustWork();
    }
}
