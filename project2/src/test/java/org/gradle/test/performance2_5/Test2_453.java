package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_453 {
    private final Production2_453 production = new Production2_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}