package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_204 {
    private final Production5_204 production = new Production5_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}