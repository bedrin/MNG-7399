package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_497 {
    private final Production4_497 production = new Production4_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}