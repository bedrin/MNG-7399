package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_286 {
    private final Production3_286 production = new Production3_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}