package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_360 {
    private final Production7_360 production = new Production7_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}