package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_115 {
    private final Production1_115 production = new Production1_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}