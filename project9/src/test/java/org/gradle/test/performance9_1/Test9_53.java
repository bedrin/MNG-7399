package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_53 {
    private final Production9_53 production = new Production9_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}