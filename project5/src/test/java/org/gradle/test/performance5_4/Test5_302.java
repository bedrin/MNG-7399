package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_302 {
    private final Production5_302 production = new Production5_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}