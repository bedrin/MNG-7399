package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_315 {
    private final Production4_315 production = new Production4_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}