package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_70 {
    private final Production5_70 production = new Production5_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}