package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_112 {
    private final Production7_112 production = new Production7_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}