package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_87 {
    private final Production5_87 production = new Production5_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}