package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_410 {
    private final Production5_410 production = new Production5_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}