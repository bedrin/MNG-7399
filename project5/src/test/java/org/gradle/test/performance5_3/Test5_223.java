package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_223 {
    private final Production5_223 production = new Production5_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}