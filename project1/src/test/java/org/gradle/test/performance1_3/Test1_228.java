package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_228 {
    private final Production1_228 production = new Production1_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}