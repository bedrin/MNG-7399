package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_52 {
    private final Production1_52 production = new Production1_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}