package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_239 {
    private final Production5_239 production = new Production5_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}