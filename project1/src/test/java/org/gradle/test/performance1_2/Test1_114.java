package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_114 {
    private final Production1_114 production = new Production1_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}