package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_182 {
    private final Production7_182 production = new Production7_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}