package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_283 {
    private final Production5_283 production = new Production5_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}