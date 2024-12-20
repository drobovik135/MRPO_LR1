package org.example.stable;

import java.util.List;

public class StaticMath {
    public static int lcm(Integer a, Integer b)
    {
        if(a == null || b == null)
            return 0;

        Integer lcm = b;
        if (a > b) {
            lcm = a;
        }

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
    }

    public static Integer lcm(List<Integer> input)
    {
        Integer result = input.get(0);
        for(int i = 1; i < input.size(); i++)
            result = lcm(result, input.get(i));
        return result;
    }
}
