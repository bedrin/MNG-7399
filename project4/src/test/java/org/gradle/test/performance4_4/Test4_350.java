package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_350 {
    private final Production4_350 production = new Production4_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}