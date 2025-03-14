package pl.kedrabartosz.designpatterns.strategy.strategypattern.phones;

public class Person {
    private Phone phone;

    public Person(Phone phone) {
        this.phone = phone;
    }
    public void makeAPhoneCall(){
        System.out.println("call" + phone.makeCall());
    }
}