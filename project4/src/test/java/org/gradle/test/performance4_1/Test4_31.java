package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_31 {
    private final Production4_31 production = new Production4_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}