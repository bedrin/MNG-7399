package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_5 {
    private final Production4_5 production = new Production4_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}