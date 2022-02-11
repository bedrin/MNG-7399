package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_16 {
    private final Production4_16 production = new Production4_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}