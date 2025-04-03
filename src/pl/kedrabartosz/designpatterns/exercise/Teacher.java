package pl.kedrabartosz.designpatterns.exercise;

public class Teacher {
    private BasicHomework basicHomework;

    public Teacher(BasicHomework basicHomework) {
        this.basicHomework = basicHomework;
    }

    // juz jest duzo pol bo jest ponad 4 i gdyby doszla kolejna werjsa
// zadania domowego to by trzeba bylo dalej dodac kolejne pola oraz ifa
    // ifologia dalej została
    public void giveHomework() {
        System.out.println("teacher add exercise");
        basicHomework.doHomework();
    }
}