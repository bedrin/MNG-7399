package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_247 {
    private final Production5_247 production = new Production5_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}