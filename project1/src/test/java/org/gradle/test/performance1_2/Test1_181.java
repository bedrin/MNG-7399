package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_181 {
    private final Production1_181 production = new Production1_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}