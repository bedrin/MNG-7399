package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_188 {
    private final Production8_188 production = new Production8_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}