package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_403 {
    private final Production3_403 production = new Production3_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}