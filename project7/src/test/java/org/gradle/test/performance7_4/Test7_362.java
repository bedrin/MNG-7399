package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_362 {
    private final Production7_362 production = new Production7_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}