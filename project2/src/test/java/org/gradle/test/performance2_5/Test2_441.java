package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_441 {
    private final Production2_441 production = new Production2_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}