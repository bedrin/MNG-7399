package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_472 {
    private final Production4_472 production = new Production4_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}