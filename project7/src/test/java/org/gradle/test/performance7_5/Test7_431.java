package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_431 {
    private final Production7_431 production = new Production7_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}