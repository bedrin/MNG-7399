package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_495 {
    private final Production7_495 production = new Production7_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}