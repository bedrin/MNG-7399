package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_150 {
    private final Production1_150 production = new Production1_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}