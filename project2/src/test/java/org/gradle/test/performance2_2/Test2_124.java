package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_124 {
    private final Production2_124 production = new Production2_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}