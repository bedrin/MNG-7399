package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_451 {
    private final Production3_451 production = new Production3_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}