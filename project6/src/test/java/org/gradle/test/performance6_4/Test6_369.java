package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_369 {
    private final Production6_369 production = new Production6_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}