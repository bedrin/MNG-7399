package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_378 {
    private final Production1_378 production = new Production1_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}