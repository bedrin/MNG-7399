package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_14 {
    private final Production4_14 production = new Production4_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}