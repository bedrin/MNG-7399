package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_326 {
    private final Production8_326 production = new Production8_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}