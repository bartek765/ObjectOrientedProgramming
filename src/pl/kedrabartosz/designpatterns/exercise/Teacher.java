package pl.kedrabartosz.designpatterns.exercise;

import java.util.Scanner;

public class Teacher {
    private AnswerHomework answerHomework;
    private BasicHomework basicHomework;
    private ShortenArticleHomework shortenArticleHomework;
    private ReadAnswerShortenAndLearnByHeartHomework readAnswerShortenAndLearnByHeartHomework;
    private ReadAnswerQuestionLearnByHeartHomework readAnswerQuestionLearnByHeartHomework;

    public Teacher(BasicHomework basicHomework, AnswerHomework answerHomework,  ShortenArticleHomework shortenArticleHomework, ReadAnswerShortenAndLearnByHeartHomework readAnswerShortenAndLearnByHeartHomework, ReadAnswerQuestionLearnByHeartHomework readAnswerQuestionLearnByHeartHomework) {
        this.basicHomework = basicHomework;
        this.answerHomework = answerHomework;
        this.shortenArticleHomework = shortenArticleHomework;
        this.readAnswerShortenAndLearnByHeartHomework = readAnswerShortenAndLearnByHeartHomework;
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
        } else if (readAnswerShortenAndLearnByHeartHomework != null) {
            readAnswerShortenAndLearnByHeartHomework.doHomework();
        } else {
            readAnswerQuestionLearnByHeartHomework.doHomework();
        }
    }
}