package pl.kedrabartosz.designpatterns.exercise;


//answer  - basic + "odpoweidzi"
public class AnswerHomework extends BasicHomework {
    private BasicHomework basicHomework;

  public AnswerHomework(BasicHomework basicHomework) {
      this.basicHomework = basicHomework;
  }

  @Override
    public void doHomework() {
      this.basicHomework.doHomework();
      System.out.println("and answer questions");
  }
}
