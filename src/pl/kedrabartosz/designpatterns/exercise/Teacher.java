package pl.kedrabartosz.designpatterns.exercise;

import java.util.Scanner;

public class Teacher {
    AnswerHomework answerHomework = new AnswerHomework();
    BasicHomework basicHomework = new BasicHomework();
    ShortenArticleHomework shortenArticleHomework = new ShortenArticleHomework();
    ReadAnswerShortenAndLearnByHeartHomework readAnswerShortenAndLearnByHeartHomework
            = new ReadAnswerShortenAndLearnByHeartHomework();
    ReadAnswerQuestionLearnByHeartHomework readAnswerQuestionLearnByHeartHomework =
            new ReadAnswerQuestionLearnByHeartHomework();

    public void doHomework() {
        System.out.println("which options select?");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option == 1) {
            answerHomework.doHomework();
        } else if (option == 2) {
            basicHomework.doHomework();
        } else if (option == 3) {
            shortenArticleHomework.doHomework();
        } else if (option == 4){
            readAnswerShortenAndLearnByHeartHomework.doHomework();
        }else {
            readAnswerQuestionLearnByHeartHomework.doHomework();
        }
    }
}