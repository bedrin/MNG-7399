package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_342 {
    private final Production5_342 production = new Production5_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}