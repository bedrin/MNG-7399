package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_445 {
    private final Production8_445 production = new Production8_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}