package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_294 {
    private final Production4_294 production = new Production4_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}