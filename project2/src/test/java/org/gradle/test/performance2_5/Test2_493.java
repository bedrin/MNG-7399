package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_493 {
    private final Production2_493 production = new Production2_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}