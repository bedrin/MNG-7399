package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_126 {
    private final Production4_126 production = new Production4_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}