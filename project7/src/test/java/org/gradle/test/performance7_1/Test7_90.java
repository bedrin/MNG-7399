package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_90 {
    private final Production7_90 production = new Production7_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}