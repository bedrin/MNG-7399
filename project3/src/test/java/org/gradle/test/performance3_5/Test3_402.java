package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_402 {
    private final Production3_402 production = new Production3_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}