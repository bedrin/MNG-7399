package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_486 {
    private final Production3_486 production = new Production3_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}