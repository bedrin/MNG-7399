package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_400 {
    private final Production3_400 production = new Production3_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}