package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_104 {
    private final Production4_104 production = new Production4_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}