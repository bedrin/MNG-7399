package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_318 {
    private final Production3_318 production = new Production3_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}