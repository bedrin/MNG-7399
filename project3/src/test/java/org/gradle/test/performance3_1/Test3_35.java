package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_35 {
    private final Production3_35 production = new Production3_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}