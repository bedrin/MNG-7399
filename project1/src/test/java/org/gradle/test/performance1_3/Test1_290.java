package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_290 {
    private final Production1_290 production = new Production1_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}