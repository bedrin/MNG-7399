package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_481 {
    private final Production7_481 production = new Production7_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}