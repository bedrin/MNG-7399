package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_321 {
    private final Production7_321 production = new Production7_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}