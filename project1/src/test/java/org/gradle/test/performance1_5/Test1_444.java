package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_444 {
    private final Production1_444 production = new Production1_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}