package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_497 {
    private final Production1_497 production = new Production1_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}