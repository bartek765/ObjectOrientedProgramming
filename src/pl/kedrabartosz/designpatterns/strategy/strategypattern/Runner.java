package pl.kedrabartosz.designpatterns.strategy.strategypattern;

import pl.kedrabartosz.designpatterns.strategy.strategypattern.microphone.HighSensitivity;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.microphone.LowSensitivity;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.microphone.MediumSensitivity;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.microphone.Microphone;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.reading.FastReading;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.reading.NormalReading;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.reading.Person;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.reading.SlowReading;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.vehicle.Bicycle;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.vehicle.Car;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.vehicle.Vehicle;
import pl.kedrabartosz.designpatterns.strategy.strategypattern.vehicle.Walking;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Microphone Sensitivity Test:");
        Microphone mic = new Microphone(new HighSensitivity());
        System.out.println(mic.record("Hello world"));

        mic.setSensitivity(new MediumSensitivity());
        System.out.println(mic.record("Hello world"));

        mic.setSensitivity(new LowSensitivity());
        System.out.println(mic.record("Hello world"));

        System.out.println("\nReading Speed Test:");
        Person person = new Person(new NormalReading());
        person.readBook("Robert");

        person.setReadingSpeed(new FastReading());
        person.readBook("Kacper");

        person.setReadingSpeed(new SlowReading());
        person.readBook("Nikodem");

        System.out.println("\nMovement Speed Test:");
        Vehicle vehicle = new Vehicle(new Car(), 1999);
        vehicle.travel();

        vehicle.setMovementSpeed(new Bicycle());
        vehicle.travel();

        vehicle.setMovementSpeed(new Walking());
        vehicle.travel();
    }
}