package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_60 {
    private final Production4_60 production = new Production4_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}