package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_216 {
    private final Production2_216 production = new Production2_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}