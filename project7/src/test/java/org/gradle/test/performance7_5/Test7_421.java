package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_421 {
    private final Production7_421 production = new Production7_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}