package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_460 {
    private final Production3_460 production = new Production3_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}