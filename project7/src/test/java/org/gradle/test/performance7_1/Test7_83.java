package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_83 {
    private final Production7_83 production = new Production7_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}