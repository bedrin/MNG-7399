package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_375 {
    private final Production5_375 production = new Production5_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}