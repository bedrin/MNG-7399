package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_450 {
    private final Production3_450 production = new Production3_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}