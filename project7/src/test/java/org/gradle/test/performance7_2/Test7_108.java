package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_108 {
    private final Production7_108 production = new Production7_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}