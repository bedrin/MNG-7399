package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_237 {
    private final Production5_237 production = new Production5_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}