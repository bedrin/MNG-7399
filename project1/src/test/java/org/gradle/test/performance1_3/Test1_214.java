package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_214 {
    private final Production1_214 production = new Production1_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}