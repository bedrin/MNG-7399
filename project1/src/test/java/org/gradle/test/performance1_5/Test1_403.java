package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_403 {
    private final Production1_403 production = new Production1_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}