package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_193 {
    private final Production2_193 production = new Production2_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}