package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_99 {
    private final Production4_99 production = new Production4_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}