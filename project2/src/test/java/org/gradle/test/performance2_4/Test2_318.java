package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_318 {
    private final Production2_318 production = new Production2_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}