package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_484 {
    private final Production4_484 production = new Production4_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}