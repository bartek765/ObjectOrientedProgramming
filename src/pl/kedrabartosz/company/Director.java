package pl.kedrabartosz.company;

import java.util.List;

public class Director extends Manager {
    private List<Manager> managers;

    public Director(String name, String surname) {
        super(name, surname);
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public void managerMustWork() {
        for (int i = 0; i < managers.size(); i++) {
            Manager manager = managers.get(i);
            manager.managerWork();
        }
        System.out.println("my managers are working");
    }
}
