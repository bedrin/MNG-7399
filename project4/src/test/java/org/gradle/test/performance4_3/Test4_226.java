package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_226 {
    private final Production4_226 production = new Production4_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}