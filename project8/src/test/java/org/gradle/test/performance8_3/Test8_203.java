package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_203 {
    private final Production8_203 production = new Production8_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}