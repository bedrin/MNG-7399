package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_40 {
    private final Production8_40 production = new Production8_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}