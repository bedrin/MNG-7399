package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_330 {
    private final Production4_330 production = new Production4_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}