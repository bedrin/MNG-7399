package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_175 {
    private final Production5_175 production = new Production5_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}