package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_220 {
    private final Production7_220 production = new Production7_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}