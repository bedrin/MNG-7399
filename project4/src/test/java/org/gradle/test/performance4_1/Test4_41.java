package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_41 {
    private final Production4_41 production = new Production4_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}