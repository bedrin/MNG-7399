package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_350 {
    private final Production3_350 production = new Production3_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}