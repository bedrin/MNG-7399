package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_131 {
    private final Production2_131 production = new Production2_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}