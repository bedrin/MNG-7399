package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_471 {
    private final Production3_471 production = new Production3_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}