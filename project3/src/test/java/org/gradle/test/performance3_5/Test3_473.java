package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_473 {
    private final Production3_473 production = new Production3_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}