package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_130 {
    private final Production3_130 production = new Production3_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}