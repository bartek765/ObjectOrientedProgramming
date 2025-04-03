package pl.kedrabartosz.designpatterns.exercise;

public class Runner {
    public static void main(String[] args) {
        // bazowa klasa do dekoracji
        var basicHomework = new BasicHomework();
        // różne dekoratory
        var answerHomework = new AnswerHomework(basicHomework);
        var readAnswerQuestionLearnByHeart = new LearnByHeart(answerHomework);
        var readAnswerQuestionLearnByHeartAndShorten = new ShortenArticleHomework(readAnswerQuestionLearnByHeart);

        Teacher teacher = new Teacher(readAnswerQuestionLearnByHeartAndShorten);
        teacher.giveHomework();
    }
}