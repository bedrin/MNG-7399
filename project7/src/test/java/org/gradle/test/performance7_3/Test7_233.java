package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_233 {
    private final Production7_233 production = new Production7_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}