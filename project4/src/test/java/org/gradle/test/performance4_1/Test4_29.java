package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_29 {
    private final Production4_29 production = new Production4_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}