package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_246 {
    private final Production7_246 production = new Production7_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}