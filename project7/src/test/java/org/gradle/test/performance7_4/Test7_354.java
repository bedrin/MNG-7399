package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_354 {
    private final Production7_354 production = new Production7_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}