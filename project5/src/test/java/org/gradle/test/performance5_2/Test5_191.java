package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_191 {
    private final Production5_191 production = new Production5_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}