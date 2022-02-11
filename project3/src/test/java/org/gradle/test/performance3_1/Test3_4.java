package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_4 {
    private final Production3_4 production = new Production3_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}