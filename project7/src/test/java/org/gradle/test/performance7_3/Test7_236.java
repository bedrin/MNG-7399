package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_236 {
    private final Production7_236 production = new Production7_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}