package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_292 {
    private final Production3_292 production = new Production3_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}