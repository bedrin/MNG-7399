package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_404 {
    private final Production9_404 production = new Production9_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}