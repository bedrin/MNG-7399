package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_419 {
    private final Production5_419 production = new Production5_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}