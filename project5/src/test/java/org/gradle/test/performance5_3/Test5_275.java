package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_275 {
    private final Production5_275 production = new Production5_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}