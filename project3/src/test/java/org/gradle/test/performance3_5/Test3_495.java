package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_495 {
    private final Production3_495 production = new Production3_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}