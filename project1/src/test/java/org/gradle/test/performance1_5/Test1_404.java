package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_404 {
    private final Production1_404 production = new Production1_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}