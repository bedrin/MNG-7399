package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_298 {
    private final Production7_298 production = new Production7_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}