package pl.kedrabartosz.designpatterns.exercise;

public class Runner {
    public static void main(String[] args) {
        BasicHomework basicHomework = new BasicHomework();
        AnswerHomework answerHomework = new AnswerHomework(basicHomework);
        LearnByHeart readAnswerQuestionLearnByHeartHomework = new LearnByHeart(answerHomework);
        ShortenArticleHomework shortenArticle = new ShortenArticleHomework(readAnswerQuestionLearnByHeartHomework);
        Teacher teacher = new Teacher(null, null, shortenArticle, null);
        //zbyt duzo rzeczy w konstuktorze i latwo sie pomylic
        teacher.doHomework();
    }
}