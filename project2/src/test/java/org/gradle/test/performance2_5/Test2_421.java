package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_421 {
    private final Production2_421 production = new Production2_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}