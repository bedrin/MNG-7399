package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_218 {
    private final Production5_218 production = new Production5_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}