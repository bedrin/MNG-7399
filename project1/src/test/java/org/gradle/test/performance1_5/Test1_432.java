package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_432 {
    private final Production1_432 production = new Production1_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}