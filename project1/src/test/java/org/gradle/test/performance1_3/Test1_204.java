package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_204 {
    private final Production1_204 production = new Production1_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}