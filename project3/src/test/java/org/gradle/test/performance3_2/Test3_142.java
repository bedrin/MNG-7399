package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_142 {
    private final Production3_142 production = new Production3_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}