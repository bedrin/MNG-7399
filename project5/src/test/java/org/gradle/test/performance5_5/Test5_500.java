package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_500 {
    private final Production5_500 production = new Production5_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}