package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_98 {
    private final Production4_98 production = new Production4_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}