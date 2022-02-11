package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_229 {
    private final Production4_229 production = new Production4_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}