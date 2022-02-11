package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_10 {
    private final Production4_10 production = new Production4_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}