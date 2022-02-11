package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_477 {
    private final Production5_477 production = new Production5_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}