package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_168 {
    private final Production4_168 production = new Production4_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}