package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_467 {
    private final Production4_467 production = new Production4_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}