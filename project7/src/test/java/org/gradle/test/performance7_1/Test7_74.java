package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_74 {
    private final Production7_74 production = new Production7_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}