package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_487 {
    private final Production2_487 production = new Production2_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}