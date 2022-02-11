package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_474 {
    private final Production5_474 production = new Production5_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}