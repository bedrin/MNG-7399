package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_4 {
    private final Production8_4 production = new Production8_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}