package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_111 {
    private final Production7_111 production = new Production7_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}