package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_383 {
    private final Production2_383 production = new Production2_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}