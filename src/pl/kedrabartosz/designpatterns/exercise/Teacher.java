package pl.kedrabartosz.designpatterns.exercise;

// strategia
public class Teacher {
  private BasicHomework homework;

  public Teacher(BasicHomework homework) {
    this.homework = homework;
  }

  public void doHomework() {
    System.out.println("teacher zadaje zadania:");
    // przykład polimorfizmu
    homework.doHomework();
  }
}