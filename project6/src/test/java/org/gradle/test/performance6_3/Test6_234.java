package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_234 {
    private final Production6_234 production = new Production6_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}