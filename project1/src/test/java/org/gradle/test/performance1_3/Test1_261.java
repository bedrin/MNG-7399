package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_261 {
    private final Production1_261 production = new Production1_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}