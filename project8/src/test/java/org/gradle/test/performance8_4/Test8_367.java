package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_367 {
    private final Production8_367 production = new Production8_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}