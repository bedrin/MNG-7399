package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_70 {
    private final Production7_70 production = new Production7_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}