package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_156 {
    private final Production1_156 production = new Production1_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}