package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_148 {
    private final Production5_148 production = new Production5_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}