package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_437 {
    private final Production5_437 production = new Production5_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}