package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_91 {
    private final Production8_91 production = new Production8_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}