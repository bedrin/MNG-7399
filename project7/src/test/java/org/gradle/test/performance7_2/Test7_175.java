package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_175 {
    private final Production7_175 production = new Production7_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}