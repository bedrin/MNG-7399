package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_409 {
    private final Production2_409 production = new Production2_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}