package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_55 {
    private final Production2_55 production = new Production2_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}