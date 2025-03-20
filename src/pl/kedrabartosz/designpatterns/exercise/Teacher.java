package pl.kedrabartosz.designpatterns.exercise;

import java.util.Scanner;

public class Teacher {
    //pola powinny byc prywatne
    //powinnismy je ustawic przez konstruktor
    AnswerHomework answerHomework = new AnswerHomework();
    BasicHomework basicHomework = new BasicHomework();
    ShortenArticleHomework shortenArticleHomework = new ShortenArticleHomework();
    ReadAnswerShortenAndLearnByHeartHomework readAnswerShortenAndLearnByHeartHomework
            = new ReadAnswerShortenAndLearnByHeartHomework();
    ReadAnswerQuestionLearnByHeartHomework readAnswerQuestionLearnByHeartHomework =
            new ReadAnswerQuestionLearnByHeartHomework();
// juz jest duzo pol bo jest ponad 4 i gdyby doszla kolejna werjsa
// zadania domowego to by trzeba bylo dalej dodac kolejne pola oraz ifa
    public void doHomework() {
        System.out.println("which options select?"); // ta metoda robi 2 rzeczy
        // wybiera i zadaje zadnaie domowe
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option == 1) {//jest ifologia
            answerHomework.doHomework();
        } else if (option == 2) {
            basicHomework.doHomework();
        } else if (option == 3) {
            shortenArticleHomework.doHomework();
        } else if (option == 4) {
            readAnswerShortenAndLearnByHeartHomework.doHomework();
        } else {
            readAnswerQuestionLearnByHeartHomework.doHomework();
        }
    }
}