package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_183 {
    private final Production5_183 production = new Production5_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}