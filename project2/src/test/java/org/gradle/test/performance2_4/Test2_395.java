package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_395 {
    private final Production2_395 production = new Production2_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}