package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_42 {
    private final Production9_42 production = new Production9_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}