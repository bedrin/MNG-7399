package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_289 {
    private final Production1_289 production = new Production1_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}