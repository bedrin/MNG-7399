package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_243 {
    private final Production5_243 production = new Production5_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}