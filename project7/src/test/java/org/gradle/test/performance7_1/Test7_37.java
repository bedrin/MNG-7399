package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_37 {
    private final Production7_37 production = new Production7_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}