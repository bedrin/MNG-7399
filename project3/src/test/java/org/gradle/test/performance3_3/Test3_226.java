package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_226 {
    private final Production3_226 production = new Production3_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}