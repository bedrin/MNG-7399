package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_3 {
    private final Production8_3 production = new Production8_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}