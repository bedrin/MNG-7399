package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_66 {
    private final Production4_66 production = new Production4_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}