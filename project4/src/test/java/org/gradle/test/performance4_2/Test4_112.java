package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_112 {
    private final Production4_112 production = new Production4_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}