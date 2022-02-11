package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_202 {
    private final Production4_202 production = new Production4_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}