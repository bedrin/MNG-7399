package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_13 {
    private final Production5_13 production = new Production5_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}