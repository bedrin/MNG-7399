package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_174 {
    private final Production8_174 production = new Production8_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}