package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_308 {
    private final Production9_308 production = new Production9_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}