package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_218 {
    private final Production7_218 production = new Production7_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}