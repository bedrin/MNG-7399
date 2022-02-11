package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_44 {
    private final Production4_44 production = new Production4_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}