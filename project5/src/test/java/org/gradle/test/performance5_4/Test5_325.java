package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_325 {
    private final Production5_325 production = new Production5_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}