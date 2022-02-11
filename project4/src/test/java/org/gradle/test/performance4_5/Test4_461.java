package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_461 {
    private final Production4_461 production = new Production4_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}