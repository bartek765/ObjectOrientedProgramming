package pl.kedrabartosz.designpatterns.strategy.strategypattern.phones;

public class Runner {
    public static void main(String[] args) {
        var person = new Person(new ClassicPhone());
        person.makeAPhoneCall();
    }
}