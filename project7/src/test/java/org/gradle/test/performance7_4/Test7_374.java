package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_374 {
    private final Production7_374 production = new Production7_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}