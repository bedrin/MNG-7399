package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_119 {
    private final Production5_119 production = new Production5_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}