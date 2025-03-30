package pl.kedrabartosz.designpatterns.exercise;

public class Teacher {
    private AnswerHomework answerHomework;
    private BasicHomework basicHomework;
    private ShortenArticleHomework shortenArticleHomework;
    private LearnByHeart readAnswerQuestionLearnByHeartHomework;

    public Teacher(BasicHomework basicHomework) {
        this.basicHomework = basicHomework;
        this.answerHomework = answerHomework;
        this.shortenArticleHomework = shortenArticleHomework;
        this.readAnswerQuestionLearnByHeartHomework = readAnswerQuestionLearnByHeartHomework;
    }

    // juz jest duzo pol bo jest ponad 4 i gdyby doszla kolejna werjsa
// zadania domowego to by trzeba bylo dalej dodac kolejne pola oraz ifa
    // ifologia dalej została
    public void doHomework() {
        if (basicHomework != null) {
            basicHomework.doHomework();
        } else if (answerHomework != null) {
            answerHomework.doHomework();
        } else if (shortenArticleHomework != null) {
            shortenArticleHomework.doHomework();
        } else {
            readAnswerQuestionLearnByHeartHomework.doHomework();
        }
    }
}