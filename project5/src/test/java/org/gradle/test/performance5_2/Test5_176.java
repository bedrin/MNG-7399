package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_176 {
    private final Production5_176 production = new Production5_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}