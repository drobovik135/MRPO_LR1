package org.example.games;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GameAbstract implements Game{
    protected Integer answer;
    protected String questReplica;
    protected String numerString;

    protected void printQuest(){
        System.out.println(questReplica);
        System.out.println("Question: "+numerString);
        System.out.print("Answer: ");
    }

    @Override
    public void start() {
        init();
        printQuest();
        getAnswer();
    }

    @Override
    public void getAnswer() {
        Scanner sc = new Scanner(System.in);
        Integer userAnswer = sc.nextInt();
        if(userAnswer.equals(answer)) {
            System.out.println("Congratulations! You got it!");
        }
        else {
            System.out.println("Sorry, but you lose(");
        }
    }
}
