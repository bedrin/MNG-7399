package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_58 {
    private final Production8_58 production = new Production8_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}