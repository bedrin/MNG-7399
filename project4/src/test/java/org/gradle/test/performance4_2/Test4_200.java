package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_200 {
    private final Production4_200 production = new Production4_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}