package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_400 {
    private final Production5_400 production = new Production5_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}