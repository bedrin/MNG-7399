package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_286 {
    private final Production7_286 production = new Production7_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}