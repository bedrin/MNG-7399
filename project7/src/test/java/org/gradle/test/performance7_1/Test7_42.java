package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_42 {
    private final Production7_42 production = new Production7_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}