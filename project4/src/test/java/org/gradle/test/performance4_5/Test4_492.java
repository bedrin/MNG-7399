package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_492 {
    private final Production4_492 production = new Production4_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}