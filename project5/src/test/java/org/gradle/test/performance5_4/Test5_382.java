package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_382 {
    private final Production5_382 production = new Production5_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}