package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_2 {
    private final Production8_2 production = new Production8_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}