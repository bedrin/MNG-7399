package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_452 {
    private final Production1_452 production = new Production1_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}