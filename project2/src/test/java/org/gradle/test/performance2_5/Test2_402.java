package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_402 {
    private final Production2_402 production = new Production2_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}