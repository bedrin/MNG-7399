package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_36 {
    private final Production1_36 production = new Production1_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}