package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_6 {
    private final Production7_6 production = new Production7_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}