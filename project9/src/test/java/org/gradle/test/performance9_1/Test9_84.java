package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_84 {
    private final Production9_84 production = new Production9_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}