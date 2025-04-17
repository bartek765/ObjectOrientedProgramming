package pl.kedrabartosz.maps.hashcodeequals;

public class Person {
  private Name name;
  private int age;

  public Person(Name name, int age) {
    this.name = name;
    this.age = age;
  }
  public void setName(Name name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
  public Name getName() {
    return name;
  }
  @Override
  public String toString() {
    return "Person{" +
           "name=" + name +
           ", age=" + age +
           '}';
  }
  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = result + age;
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    if (age != person.age) return false;
    if (name != null ? !name.equals(person.name) : person.name != null) return false;
    return true;
  }
}
