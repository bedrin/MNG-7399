package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_276 {
    private final Production3_276 production = new Production3_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}