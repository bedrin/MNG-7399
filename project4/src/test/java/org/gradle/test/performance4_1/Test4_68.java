package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_68 {
    private final Production4_68 production = new Production4_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}