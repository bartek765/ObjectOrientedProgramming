package pl.kedrabartosz.designpatterns.exercise;

public class ReadAnswerShortenAndLearnByHeartHomework extends BasicHomework{
   private BasicHomework basicHomework;

    public ReadAnswerShortenAndLearnByHeartHomework(BasicHomework basicHomework) {
        this.basicHomework = basicHomework;
    }

    @Override
    public void doHomework() {
        this.basicHomework.doHomework();
        System.out.println("and shorten");

    }
}