package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_437 {
    private final Production4_437 production = new Production4_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}