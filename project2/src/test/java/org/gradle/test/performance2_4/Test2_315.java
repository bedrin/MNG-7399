package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_315 {
    private final Production2_315 production = new Production2_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}