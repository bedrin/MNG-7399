package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_81 {
    private final Production5_81 production = new Production5_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}