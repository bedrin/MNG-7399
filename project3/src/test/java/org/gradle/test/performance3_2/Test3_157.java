package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_157 {
    private final Production3_157 production = new Production3_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}