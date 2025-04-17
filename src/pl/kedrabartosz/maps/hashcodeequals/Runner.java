package pl.kedrabartosz.maps.hashcodeequals;

import java.util.HashSet;
import java.util.Set;

public class Runner {
  public static void main(String[] args) {
    // jeżeli hashcode sie powtórzył to wystąpiła kolizja hashy !!! to później przechodzimy do equals !!!
    // jeśli equals zwrócił true to hashcode się powtórzyły (że wystąpiła kolizja)

    Person nick = new Person(new Name("Nicholas"), 44);
    Person nick2 = new Person(new Name("Nicholas"), 44);
    Person matthew = new Person(new Name("Matthew"), 44);
    Set<Person> personSet = new HashSet<>();
    personSet.add(nick);
    personSet.add(nick2);
    personSet.add(matthew);
    for (Person person : personSet) {
      System.out.println(person);
    }
  }
}
