package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_365 {
    private final Production4_365 production = new Production4_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}