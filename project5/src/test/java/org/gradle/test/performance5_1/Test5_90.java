package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_90 {
    private final Production5_90 production = new Production5_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}