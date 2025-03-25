package pl.kedrabartosz.designpatterns.exercise;

public class LearnByHeart extends BasicHomework{
    private BasicHomework basicHomework;

    public LearnByHeart(BasicHomework basicHomework) {
        this.basicHomework = basicHomework;
    }

    @Override
    public void doHomework() {
        this.basicHomework.doHomework();
        System.out.println("and learn by heart");
    }
}

