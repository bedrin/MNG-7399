package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_84 {
    private final Production5_84 production = new Production5_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}