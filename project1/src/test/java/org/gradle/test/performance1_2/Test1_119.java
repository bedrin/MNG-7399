package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_119 {
    private final Production1_119 production = new Production1_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}