package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_435 {
    private final Production1_435 production = new Production1_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}