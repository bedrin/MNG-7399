package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_325 {
    private final Production8_325 production = new Production8_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}