package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_118 {
    private final Production1_118 production = new Production1_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}