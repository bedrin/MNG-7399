package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_361 {
    private final Production7_361 production = new Production7_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}