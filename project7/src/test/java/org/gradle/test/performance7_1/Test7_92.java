package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_92 {
    private final Production7_92 production = new Production7_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}