package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_48 {
    private final Production7_48 production = new Production7_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}