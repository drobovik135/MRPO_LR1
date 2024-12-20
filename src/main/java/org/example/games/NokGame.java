package org.example.games;

import org.example.stable.StaticMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NokGame extends GameAbstract {
    public NokGame() {
        answer = 0;
        numerString = "";
    }

    @Override
    public void init() {
        List<Integer> numbers = new ArrayList<>();
        questReplica = "Find the smallest common multiple of given numbers";

        Random rand = new Random();
        for(int i = 0; i < 3; ++i) {
            Integer num = rand.nextInt(1, 20);
            numbers.add(num);
            numerString += (num + " ");
        }
        answer = StaticMath.lcm(numbers);
    }
}
