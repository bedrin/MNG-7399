package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_204 {
    private final Production3_204 production = new Production3_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}