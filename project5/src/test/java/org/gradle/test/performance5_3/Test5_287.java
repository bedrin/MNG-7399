package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_287 {
    private final Production5_287 production = new Production5_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}