package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_65 {
    private final Production4_65 production = new Production4_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}