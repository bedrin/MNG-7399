package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_55 {
    private final Production7_55 production = new Production7_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}