package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_93 {
    private final Production1_93 production = new Production1_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}