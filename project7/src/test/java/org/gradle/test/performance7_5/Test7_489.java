package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_489 {
    private final Production7_489 production = new Production7_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}