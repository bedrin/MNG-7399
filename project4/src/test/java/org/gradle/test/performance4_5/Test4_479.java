package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_479 {
    private final Production4_479 production = new Production4_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}