package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_59 {
    private final Production7_59 production = new Production7_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}