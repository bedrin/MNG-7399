package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_140 {
    private final Production3_140 production = new Production3_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}