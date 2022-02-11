package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_90 {
    private final Production4_90 production = new Production4_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}