package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_23 {
    private final Production3_23 production = new Production3_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}