package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_57 {
    private final Production4_57 production = new Production4_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}