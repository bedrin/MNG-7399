package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_118 {
    private final Production5_118 production = new Production5_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}