package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_397 {
    private final Production3_397 production = new Production3_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}