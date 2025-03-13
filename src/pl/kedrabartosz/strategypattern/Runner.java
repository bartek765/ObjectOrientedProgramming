package pl.kedrabartosz.strategypattern;

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
        Vehicle vehicle = new Vehicle(new Car());
        vehicle.travel();

        vehicle.setMovementSpeed(new Bicycle());
        vehicle.travel();

        vehicle.setMovementSpeed(new Walking());
        vehicle.travel();
    }
}