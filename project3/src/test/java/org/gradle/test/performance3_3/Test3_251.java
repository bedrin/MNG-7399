package org.gradle.test.performance3_3;

import static org.junit.Assert.assertEquals;

public class Test3_251 {
    private final Production3_251 production = new Production3_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}