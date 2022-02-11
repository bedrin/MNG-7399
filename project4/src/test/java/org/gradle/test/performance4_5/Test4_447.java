package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_447 {
    private final Production4_447 production = new Production4_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}