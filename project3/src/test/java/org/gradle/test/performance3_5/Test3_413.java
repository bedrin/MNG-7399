package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_413 {
    private final Production3_413 production = new Production3_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}