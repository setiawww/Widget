package com.dicoding.setiawww.widget;

import java.util.Random;

/**
 * Created by setiawww on 21/11/2017.
 */

public class NumberGenerator {

    public static int Generate(int max){

        Random random = new Random();
        int randomInt = random.nextInt(max);
        return randomInt;
    }
}
