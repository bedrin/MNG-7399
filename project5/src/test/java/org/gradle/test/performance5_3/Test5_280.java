package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_280 {
    private final Production5_280 production = new Production5_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}