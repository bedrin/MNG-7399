package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_109 {
    private final Production5_109 production = new Production5_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}