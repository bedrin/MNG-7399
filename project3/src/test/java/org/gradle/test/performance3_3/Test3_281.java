package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_281 {
    private final Production3_281 production = new Production3_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}