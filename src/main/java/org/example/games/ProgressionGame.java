package org.example.games;

import org.example.stable.StaticMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgressionGame extends GameAbstract {
    public ProgressionGame() {
        answer = 0;
        numerString = "";
    }

    @Override
    public void init() {
        questReplica = "What number is missing in the progression?";
        List<Integer> numbers = new ArrayList<>();

        Random rand = new Random();
        int factor = rand.nextInt(2, 5);
        int first = rand.nextInt(2, 5);
        int length = rand.nextInt(4, 9);

        numbers.add(first);
        for(int i = 0; i < length; i++) {
            numbers.add(numbers.get(numbers.size() - 1) * factor);
        }

        int miss = rand.nextInt(0, numbers.size() - 1);
        answer = numbers.get(miss);
        numbers.set(miss, -1);

        for(Integer number : numbers) {
            if(number == -1){
                numerString += ".. ";
                continue;
            }
            numerString += number + " ";
        }
    }
}