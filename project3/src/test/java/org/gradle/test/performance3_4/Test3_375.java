package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_375 {
    private final Production3_375 production = new Production3_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}