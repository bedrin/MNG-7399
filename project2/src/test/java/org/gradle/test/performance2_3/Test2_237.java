package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_237 {
    private final Production2_237 production = new Production2_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}