package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_462 {
    private final Production3_462 production = new Production3_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}