package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_233 {
    private final Production3_233 production = new Production3_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}