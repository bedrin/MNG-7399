package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_484 {
    private final Production1_484 production = new Production1_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}