package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_48 {
    private final Production9_48 production = new Production9_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}