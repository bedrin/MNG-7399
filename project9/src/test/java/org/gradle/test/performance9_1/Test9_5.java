package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_5 {
    private final Production9_5 production = new Production9_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}