package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_238 {
    private final Production3_238 production = new Production3_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}