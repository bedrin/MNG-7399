package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_241 {
    private final Production9_241 production = new Production9_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}