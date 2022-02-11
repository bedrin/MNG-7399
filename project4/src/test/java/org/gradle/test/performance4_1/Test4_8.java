package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_8 {
    private final Production4_8 production = new Production4_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}