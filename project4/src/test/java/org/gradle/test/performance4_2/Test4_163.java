package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_163 {
    private final Production4_163 production = new Production4_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}