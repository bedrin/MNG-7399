package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_468 {
    private final Production4_468 production = new Production4_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}