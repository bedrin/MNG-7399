package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_69 {
    private final Production5_69 production = new Production5_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}