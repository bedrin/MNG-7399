package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_170 {
    private final Production7_170 production = new Production7_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}