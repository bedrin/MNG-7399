package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_500 {
    private final Production8_500 production = new Production8_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}