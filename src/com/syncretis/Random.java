package com.syncretis;

import static java.lang.Math.random;

public class Random {
    public static int RandomNumber( int endDiap) {
        int randomIndex = 1 + (int) (random() * endDiap);
        return randomIndex;
    }
}
