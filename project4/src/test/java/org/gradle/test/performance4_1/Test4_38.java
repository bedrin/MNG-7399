package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_38 {
    private final Production4_38 production = new Production4_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}