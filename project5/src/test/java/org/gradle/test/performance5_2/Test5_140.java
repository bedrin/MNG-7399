package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_140 {
    private final Production5_140 production = new Production5_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}