package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_498 {
    private final Production4_498 production = new Production4_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}