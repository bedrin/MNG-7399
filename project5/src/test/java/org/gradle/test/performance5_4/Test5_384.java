package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_384 {
    private final Production5_384 production = new Production5_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}