package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_59 {
    private final Production1_59 production = new Production1_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}