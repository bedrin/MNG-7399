package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_386 {
    private final Production5_386 production = new Production5_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}