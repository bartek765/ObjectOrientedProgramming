package pl.kedrabartosz.maps.hashcodeequals;

public class Name {
  private String name;

  public Name(String name) {
    this.name = name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  @Override
  public String toString() {
    return "Name{" +
           "name='" + name + '\'' +
           '}';
  }

  @Override
  public int hashCode() {
    // ternary operator - Elvis operator 0 - skrócony if
    return 999;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Name name1 = (Name) o;
    if (name != null ? !name.equals(name1.name) : name1.name !=
                                                  null) return false;
    return true;
  }

}
