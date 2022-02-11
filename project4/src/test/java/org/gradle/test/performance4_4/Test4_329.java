package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_329 {
    private final Production4_329 production = new Production4_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}