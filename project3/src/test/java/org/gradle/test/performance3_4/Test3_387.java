package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_387 {
    private final Production3_387 production = new Production3_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}