package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_489 {
    private final Production1_489 production = new Production1_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}