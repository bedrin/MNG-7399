package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_64 {
    private final Production3_64 production = new Production3_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}