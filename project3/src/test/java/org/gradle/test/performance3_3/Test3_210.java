package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_210 {
    private final Production3_210 production = new Production3_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}