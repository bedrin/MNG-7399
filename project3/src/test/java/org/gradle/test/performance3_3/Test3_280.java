package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_280 {
    private final Production3_280 production = new Production3_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}