package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_483 {
    private final Production3_483 production = new Production3_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}