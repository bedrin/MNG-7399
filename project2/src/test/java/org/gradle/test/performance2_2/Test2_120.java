package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_120 {
    private final Production2_120 production = new Production2_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}