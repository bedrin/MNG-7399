package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_180 {
    private final Production5_180 production = new Production5_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}