package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_78 {
    private final Production5_78 production = new Production5_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}