package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_273 {
    private final Production2_273 production = new Production2_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}