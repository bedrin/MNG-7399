package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_4 {
    private final Production7_4 production = new Production7_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}