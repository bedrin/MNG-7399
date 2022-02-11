package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_151 {
    private final Production4_151 production = new Production4_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}