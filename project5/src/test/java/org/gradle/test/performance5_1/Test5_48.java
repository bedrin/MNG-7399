package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_48 {
    private final Production5_48 production = new Production5_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}