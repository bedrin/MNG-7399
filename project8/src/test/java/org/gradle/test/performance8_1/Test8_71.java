package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_71 {
    private final Production8_71 production = new Production8_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}