package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_60 {
    private final Production3_60 production = new Production3_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}