package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_306 {
    private final Production7_306 production = new Production7_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}