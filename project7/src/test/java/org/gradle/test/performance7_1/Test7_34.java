package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_34 {
    private final Production7_34 production = new Production7_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}