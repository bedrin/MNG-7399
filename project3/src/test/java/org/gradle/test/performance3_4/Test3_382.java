package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_382 {
    private final Production3_382 production = new Production3_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}