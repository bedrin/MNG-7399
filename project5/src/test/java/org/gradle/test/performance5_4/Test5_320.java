package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_320 {
    private final Production5_320 production = new Production5_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}