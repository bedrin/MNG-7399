package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_336 {
    private final Production3_336 production = new Production3_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}