package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_297 {
    private final Production7_297 production = new Production7_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}