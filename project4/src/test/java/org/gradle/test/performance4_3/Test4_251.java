package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_251 {
    private final Production4_251 production = new Production4_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}