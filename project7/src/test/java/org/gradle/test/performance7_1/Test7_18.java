package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_18 {
    private final Production7_18 production = new Production7_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}