package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_14 {
    private final Production8_14 production = new Production8_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}