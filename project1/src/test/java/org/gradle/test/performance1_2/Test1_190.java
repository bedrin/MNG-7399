package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_190 {
    private final Production1_190 production = new Production1_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}