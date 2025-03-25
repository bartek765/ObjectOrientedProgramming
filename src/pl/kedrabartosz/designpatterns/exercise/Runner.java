package pl.kedrabartosz.designpatterns.exercise;

public class Runner {
    public static void main(String[] args) {
        BasicHomework basicHomework = new BasicHomework();
        AnswerHomework answerHomework = new AnswerHomework(basicHomework);
        ShortenArticleHomework shortenAnswerArticleHomework = new ShortenArticleHomework(answerHomework);
        LearnByHeart readAnswerQuestionLearnByHeartHomework = new LearnByHeart(answerHomework);
        ReadAnswerShortenAndLearnByHeartHomework readAnswerShortenAndLearnByHeartHomework = new ReadAnswerShortenAndLearnByHeartHomework(readAnswerQuestionLearnByHeartHomework);
        Teacher teacher = new Teacher(null , null, null, readAnswerShortenAndLearnByHeartHomework,null);
        //zbyt duzo rzeczy w konstuktorze i latwo sie pomylic
        teacher.doHomework();
    }
}