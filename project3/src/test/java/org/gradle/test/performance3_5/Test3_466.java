package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_466 {
    private final Production3_466 production = new Production3_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}