package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_133 {
    private final Production1_133 production = new Production1_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}