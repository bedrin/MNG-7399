package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_20 {
    private final Production3_20 production = new Production3_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}