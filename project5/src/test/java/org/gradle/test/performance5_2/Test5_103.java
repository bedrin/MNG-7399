package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_103 {
    private final Production5_103 production = new Production5_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}