package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_36 {
    private final Production9_36 production = new Production9_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}