package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_277 {
    private final Production2_277 production = new Production2_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}