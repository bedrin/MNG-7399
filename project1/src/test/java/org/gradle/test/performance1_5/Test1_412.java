package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_412 {
    private final Production1_412 production = new Production1_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}