package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_467 {
    private final Production5_467 production = new Production5_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}