package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_283 {
    private final Production3_283 production = new Production3_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}