package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_357 {
    private final Production1_357 production = new Production1_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}