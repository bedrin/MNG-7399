package org.gradle.test.performance3_1;

import static org.junit.Assert.assertEquals;

public class Test3_58 {
    private final Production3_58 production = new Production3_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}