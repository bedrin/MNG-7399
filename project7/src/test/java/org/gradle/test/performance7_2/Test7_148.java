package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_148 {
    private final Production7_148 production = new Production7_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}