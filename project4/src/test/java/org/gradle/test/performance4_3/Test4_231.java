package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_231 {
    private final Production4_231 production = new Production4_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}