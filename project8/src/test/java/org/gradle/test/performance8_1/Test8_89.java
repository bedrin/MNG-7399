package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_89 {
    private final Production8_89 production = new Production8_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}