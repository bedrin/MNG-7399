package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_175 {
    private final Production1_175 production = new Production1_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}