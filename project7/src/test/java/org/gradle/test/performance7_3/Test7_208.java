package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_208 {
    private final Production7_208 production = new Production7_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}