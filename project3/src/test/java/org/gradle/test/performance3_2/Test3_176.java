package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_176 {
    private final Production3_176 production = new Production3_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}