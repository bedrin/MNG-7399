package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_13 {
    private final Production1_13 production = new Production1_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}