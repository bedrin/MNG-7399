package org.gradle.test.performance5_1;

import static org.junit.Assert.assertEquals;

public class Test5_14 {
    private final Production5_14 production = new Production5_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}