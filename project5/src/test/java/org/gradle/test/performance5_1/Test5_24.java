package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_24 {
    private final Production5_24 production = new Production5_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}