package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_300 {
    private final Production1_300 production = new Production1_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}