package org.example.games;

import org.example.stable.StaticMath;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NokGame extends GameAbstract {
    public NokGame() {
        answer = 0;
        numbers = new ArrayList<>();
    }

    @Override
    public void init() {
        questReplica = "Find the smallest common multiple of given numbers";

        Random rand = new Random();
        for(int i = 0; i < 3; i++) {
            numbers.add(rand.nextInt(1, 20));
        }
        answer = StaticMath.lcm(numbers);
    }
}
