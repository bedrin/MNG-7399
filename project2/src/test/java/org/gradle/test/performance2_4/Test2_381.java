package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_381 {
    private final Production2_381 production = new Production2_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}