package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_412 {
    private final Production5_412 production = new Production5_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}