package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_249 {
    private final Production5_249 production = new Production5_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}