package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_155 {
    private final Production1_155 production = new Production1_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}