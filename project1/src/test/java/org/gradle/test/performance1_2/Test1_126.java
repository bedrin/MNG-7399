package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_126 {
    private final Production1_126 production = new Production1_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}