package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_442 {
    private final Production1_442 production = new Production1_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}