package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_163 {
    private final Production9_163 production = new Production9_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}