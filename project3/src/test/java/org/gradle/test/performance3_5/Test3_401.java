package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_401 {
    private final Production3_401 production = new Production3_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}