package org.gradle.test.performance5_2;

import static org.junit.Assert.assertEquals;

public class Test5_166 {
    private final Production5_166 production = new Production5_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}