package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_61 {
    private final Production8_61 production = new Production8_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}