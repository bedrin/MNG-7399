package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_388 {
    private final Production8_388 production = new Production8_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}