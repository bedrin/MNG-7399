package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_239 {
    private final Production8_239 production = new Production8_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}