package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_479 {
    private final Production5_479 production = new Production5_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}