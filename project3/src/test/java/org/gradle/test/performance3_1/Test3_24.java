package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_24 {
    private final Production3_24 production = new Production3_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}