package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_224 {
    private final Production2_224 production = new Production2_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}