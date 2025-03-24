package pl.kedrabartosz.designpatterns.exercise;

public class Runner {
    public static void main(String[] args) {
        BasicHomework basicHomework = new BasicHomework();
        AnswerHomework answerHomework = new AnswerHomework();
        ShortenArticleHomework shortenArticleHomework = new ShortenArticleHomework();
        ReadAnswerQuestionLearnByHeartHomework readAnswerQuestionLearnByHeartHomework = new ReadAnswerQuestionLearnByHeartHomework();
        ReadAnswerShortenAndLearnByHeartHomework readAnswerShortenAndLearnByHeartHomework = new ReadAnswerShortenAndLearnByHeartHomework();
        Teacher teacher = new Teacher(basicHomework, answerHomework, shortenArticleHomework, readAnswerShortenAndLearnByHeartHomework, readAnswerQuestionLearnByHeartHomework);
        //zbyt duzo rzeczy w konstuktorze i latwo sie pomylic
        teacher.doHomework();
    }
}