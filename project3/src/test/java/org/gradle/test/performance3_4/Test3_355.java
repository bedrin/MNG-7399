package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_355 {
    private final Production3_355 production = new Production3_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}