package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_157 {
    private final Production4_157 production = new Production4_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}