package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_365 {
    private final Production7_365 production = new Production7_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}