package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_182 {
    private final Production8_182 production = new Production8_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}