package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_122 {
    private final Production7_122 production = new Production7_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}