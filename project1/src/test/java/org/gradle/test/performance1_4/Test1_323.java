package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_323 {
    private final Production1_323 production = new Production1_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}