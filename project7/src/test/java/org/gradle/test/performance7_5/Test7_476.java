package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_476 {
    private final Production7_476 production = new Production7_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}