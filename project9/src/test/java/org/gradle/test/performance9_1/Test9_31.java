package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_31 {
    private final Production9_31 production = new Production9_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}