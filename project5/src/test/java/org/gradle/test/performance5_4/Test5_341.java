package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_341 {
    private final Production5_341 production = new Production5_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}