package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_191 {
    private final Production3_191 production = new Production3_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}