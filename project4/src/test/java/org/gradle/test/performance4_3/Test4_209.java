package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_209 {
    private final Production4_209 production = new Production4_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}