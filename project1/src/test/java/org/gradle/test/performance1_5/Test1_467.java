package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_467 {
    private final Production1_467 production = new Production1_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}