package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_4 {
    private final Production4_4 production = new Production4_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}