package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_488 {
    private final Production1_488 production = new Production1_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}