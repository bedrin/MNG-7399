package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_54 {
    private final Production7_54 production = new Production7_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}