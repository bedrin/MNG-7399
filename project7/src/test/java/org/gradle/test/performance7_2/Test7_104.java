package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_104 {
    private final Production7_104 production = new Production7_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}