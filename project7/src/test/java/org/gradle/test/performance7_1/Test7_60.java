package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_60 {
    private final Production7_60 production = new Production7_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}