package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_292 {
    private final Production2_292 production = new Production2_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}