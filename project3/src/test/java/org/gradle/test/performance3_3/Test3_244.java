package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_244 {
    private final Production3_244 production = new Production3_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}