package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_491 {
    private final Production3_491 production = new Production3_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}