package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_63 {
    private final Production7_63 production = new Production7_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}