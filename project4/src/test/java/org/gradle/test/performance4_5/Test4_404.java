package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_404 {
    private final Production4_404 production = new Production4_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}