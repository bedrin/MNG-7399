package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_301 {
    private final Production5_301 production = new Production5_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}