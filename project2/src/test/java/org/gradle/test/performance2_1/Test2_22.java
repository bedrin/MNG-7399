package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_22 {
    private final Production2_22 production = new Production2_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}