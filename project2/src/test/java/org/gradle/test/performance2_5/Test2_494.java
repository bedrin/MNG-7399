package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_494 {
    private final Production2_494 production = new Production2_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}