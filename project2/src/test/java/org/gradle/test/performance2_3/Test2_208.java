package org.gradle.test.performance2_3;

import static org.junit.Assert.assertEquals;

public class Test2_208 {
    private final Production2_208 production = new Production2_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}