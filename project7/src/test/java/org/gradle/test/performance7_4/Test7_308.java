package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_308 {
    private final Production7_308 production = new Production7_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}