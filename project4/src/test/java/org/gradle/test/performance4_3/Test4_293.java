package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_293 {
    private final Production4_293 production = new Production4_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}