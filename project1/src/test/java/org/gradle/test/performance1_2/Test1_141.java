package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_141 {
    private final Production1_141 production = new Production1_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}