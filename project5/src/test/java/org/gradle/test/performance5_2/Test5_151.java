package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_151 {
    private final Production5_151 production = new Production5_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}