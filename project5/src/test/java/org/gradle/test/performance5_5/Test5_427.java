package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_427 {
    private final Production5_427 production = new Production5_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}