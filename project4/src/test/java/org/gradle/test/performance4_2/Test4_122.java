package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_122 {
    private final Production4_122 production = new Production4_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}