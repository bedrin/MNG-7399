package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_409 {
    private final Production7_409 production = new Production7_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}