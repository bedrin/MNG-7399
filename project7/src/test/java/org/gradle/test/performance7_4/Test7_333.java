package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_333 {
    private final Production7_333 production = new Production7_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}