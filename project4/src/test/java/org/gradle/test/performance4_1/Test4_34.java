package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_34 {
    private final Production4_34 production = new Production4_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}