package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_471 {
    private final Production4_471 production = new Production4_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}