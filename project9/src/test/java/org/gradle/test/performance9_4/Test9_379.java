package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_379 {
    private final Production9_379 production = new Production9_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}