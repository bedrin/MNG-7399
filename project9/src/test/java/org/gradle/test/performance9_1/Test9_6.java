package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_6 {
    private final Production9_6 production = new Production9_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}