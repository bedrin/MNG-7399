package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_113 {
    private final Production5_113 production = new Production5_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}