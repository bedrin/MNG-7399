package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_42 {
    private final Production4_42 production = new Production4_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}