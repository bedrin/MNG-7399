package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_371 {
    private final Production7_371 production = new Production7_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}