package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_129 {
    private final Production5_129 production = new Production5_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}