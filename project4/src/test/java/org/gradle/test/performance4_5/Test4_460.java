package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_460 {
    private final Production4_460 production = new Production4_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}