package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_322 {
    private final Production1_322 production = new Production1_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}