package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_196 {
    private final Production1_196 production = new Production1_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}