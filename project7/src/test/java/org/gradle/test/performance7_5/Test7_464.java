package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_464 {
    private final Production7_464 production = new Production7_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}