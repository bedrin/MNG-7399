package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_312 {
    private final Production2_312 production = new Production2_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}