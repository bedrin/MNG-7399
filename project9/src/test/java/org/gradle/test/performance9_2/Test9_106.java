package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_106 {
    private final Production9_106 production = new Production9_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}