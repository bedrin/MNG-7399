package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_139 {
    private final Production7_139 production = new Production7_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}