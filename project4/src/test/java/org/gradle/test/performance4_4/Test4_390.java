package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_390 {
    private final Production4_390 production = new Production4_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}