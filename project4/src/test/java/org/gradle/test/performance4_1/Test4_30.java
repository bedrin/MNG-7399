package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_30 {
    private final Production4_30 production = new Production4_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}