package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_413 {
    private final Production7_413 production = new Production7_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}