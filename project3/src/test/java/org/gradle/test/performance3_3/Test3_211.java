package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_211 {
    private final Production3_211 production = new Production3_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}