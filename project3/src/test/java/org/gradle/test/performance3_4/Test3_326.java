package org.gradle.test.performance3_4;

import static org.junit.Assert.assertEquals;

public class Test3_326 {
    private final Production3_326 production = new Production3_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}