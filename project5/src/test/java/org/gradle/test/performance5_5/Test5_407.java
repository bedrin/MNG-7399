package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_407 {
    private final Production5_407 production = new Production5_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}