package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_444 {
    private final Production8_444 production = new Production8_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}