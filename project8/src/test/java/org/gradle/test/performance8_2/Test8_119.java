package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_119 {
    private final Production8_119 production = new Production8_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}