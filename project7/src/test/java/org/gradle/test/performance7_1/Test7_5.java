package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_5 {
    private final Production7_5 production = new Production7_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}