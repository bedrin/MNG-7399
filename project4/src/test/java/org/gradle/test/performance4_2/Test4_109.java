package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_109 {
    private final Production4_109 production = new Production4_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}