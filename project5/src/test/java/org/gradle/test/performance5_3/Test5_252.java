package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_252 {
    private final Production5_252 production = new Production5_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}