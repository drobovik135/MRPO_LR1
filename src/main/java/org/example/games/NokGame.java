package org.example.games;

import org.example.stable.StaticMath;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NokGame implements Game {
    ArrayList<Integer> numbers;
    Integer answer;

    public NokGame() {
        answer = 0;
        numbers = new ArrayList<>();
    }

    @Override
    public void init() {
        Random rand = new Random();
        for(int i = 0; i < 3; i++) {
            numbers.add(rand.nextInt(1, 20));
        }
        answer = StaticMath.lcm(numbers);
    }

    @Override
    public void printQuest() {
        System.out.println("Find the smallest common multiple of given numbers");
        System.out.print("Question: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
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
            System.out.println("Sorry, but you got it!");
        }
    }
}
