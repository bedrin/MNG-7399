package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_98 {
    private final Production9_98 production = new Production9_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}