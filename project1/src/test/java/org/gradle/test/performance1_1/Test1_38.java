package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_38 {
    private final Production1_38 production = new Production1_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}