package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_257 {
    private final Production1_257 production = new Production1_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}