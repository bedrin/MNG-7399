package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_231 {
    private final Production3_231 production = new Production3_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}