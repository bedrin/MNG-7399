package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_447 {
    private final Production1_447 production = new Production1_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}