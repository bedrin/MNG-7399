package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_37 {
    private final Production1_37 production = new Production1_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}