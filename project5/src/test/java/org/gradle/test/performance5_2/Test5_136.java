package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_136 {
    private final Production5_136 production = new Production5_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}