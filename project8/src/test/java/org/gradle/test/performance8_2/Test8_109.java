package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_109 {
    private final Production8_109 production = new Production8_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}