package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_309 {
    private final Production7_309 production = new Production7_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}