package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_466 {
    private final Production5_466 production = new Production5_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}