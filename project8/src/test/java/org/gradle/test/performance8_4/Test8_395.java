package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_395 {
    private final Production8_395 production = new Production8_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}