package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_205 {
    private final Production1_205 production = new Production1_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}