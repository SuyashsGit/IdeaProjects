package com.sparta.oop;

import java.util.Arrays;

//Complete the solution so that it splits the string into pairs of two characters.
//If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

public class Exercises {
    public static void main(String[] args) {
        Exercises exe = new Exercises();
        System.out.println(Arrays.toString(exe.solution("Suyashere")));
    }

    public static String[] solution(String s)
    {

        StringBuilder sb = new StringBuilder();
        char[] d = s.toCharArray();
        System.out.println(d);

        if ((d.length % 2) == 0)
        {
            for (int i = 0; i < d.length; i++) {
                if (!(i % 2 == 0))
                {
                    sb.append(d[i]);
                    sb.append(",");
                } else
                    sb.append(d[i]);

            }
            String[] q = (sb.toString()).split(",");

            return q;
        } else
        {
            for (int i = 0; i < d.length; i++) {
                if (!(i % 2 == 0)) {
                    sb.append(d[i]);
                    sb.append(",");
                } else
                    sb.append(d[i]);


            }sb.append("_");

            String[] q = (sb.toString()).split(",");

            return q;

        }

    }
}

