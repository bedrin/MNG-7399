package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_274 {
    private final Production7_274 production = new Production7_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}