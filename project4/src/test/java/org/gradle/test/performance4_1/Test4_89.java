package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_89 {
    private final Production4_89 production = new Production4_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}