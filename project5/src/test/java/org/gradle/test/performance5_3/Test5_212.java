package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_212 {
    private final Production5_212 production = new Production5_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}