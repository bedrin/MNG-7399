package org.gradle.test.performance2_4;

import static org.junit.Assert.assertEquals;

public class Test2_308 {
    private final Production2_308 production = new Production2_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}