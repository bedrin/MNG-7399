package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_91 {
    private final Production4_91 production = new Production4_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}