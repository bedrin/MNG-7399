package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_221 {
    private final Production2_221 production = new Production2_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}