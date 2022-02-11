package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_1 {
    private final Production4_1 production = new Production4_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}