package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_247 {
    private final Production7_247 production = new Production7_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}