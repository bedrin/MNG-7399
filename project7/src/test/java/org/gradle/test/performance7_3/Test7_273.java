package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_273 {
    private final Production7_273 production = new Production7_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}