package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_378 {
    private final Production8_378 production = new Production8_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}