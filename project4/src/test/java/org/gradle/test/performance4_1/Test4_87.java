package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_87 {
    private final Production4_87 production = new Production4_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}