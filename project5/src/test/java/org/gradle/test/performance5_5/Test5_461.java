package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_461 {
    private final Production5_461 production = new Production5_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}