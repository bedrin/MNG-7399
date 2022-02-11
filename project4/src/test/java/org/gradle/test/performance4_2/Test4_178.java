package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_178 {
    private final Production4_178 production = new Production4_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}