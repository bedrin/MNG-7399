package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_192 {
    private final Production3_192 production = new Production3_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}