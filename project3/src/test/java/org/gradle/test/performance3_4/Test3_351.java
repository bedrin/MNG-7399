package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_351 {
    private final Production3_351 production = new Production3_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}