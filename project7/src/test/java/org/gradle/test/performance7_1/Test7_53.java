package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_53 {
    private final Production7_53 production = new Production7_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}