package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_208 {
    private final Production1_208 production = new Production1_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}