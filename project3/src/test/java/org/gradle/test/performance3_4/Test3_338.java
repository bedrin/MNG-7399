package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_338 {
    private final Production3_338 production = new Production3_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}